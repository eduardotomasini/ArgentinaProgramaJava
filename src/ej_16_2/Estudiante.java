
package ej_16_2;

import java.util.Scanner;

public class Estudiante {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
// Atributos

    String nombre;
    int edad;
    float nota;
    float promedio;
    
    // Constructores
    
    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, float notas, float promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = notas;
        this.promedio = promedio;
    }
    
    public String getNombre (){
        
        return nombre;
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public float getPromedio() {
        return promedio;
    }
 
    public void setPromedio(float promedio) {    
        this.promedio = promedio;
    }

    // Metodos
    
    void calcularAprobado() {
        System.out.println("Nombre");
        nombre = leer.next();
        
        String opc = "SI";
        int cont = 0;
        float notas = 0;

        do {

            if (opc.equals("SI")) {
                System.out.println("ingrese notas ");
                nota = leer.nextFloat();
                notas = nota + notas;
                cont++;

            }

            System.out.println("desea ingresar otra nota");
            opc = leer.next().toUpperCase();

        } while (opc.equals("SI"));

        promedio = notas / cont;

        if (promedio < 6) {
            System.out.println("Nombre" + nombre + " Desaprobo. Nota: " + promedio);
        } else {
            System.out.println("Nombre" + nombre + " Aprobo. nota: " + promedio);
        }
    }


    
}

//Crear una clase "Estudiante" con atributos como nombre, edad y promedio de
//calificaciones. Luego crear un método para calcular si el estudiante ha aprobado o no
//el curso (con una nota mínima de 6), y usa objetos de esa clase para realizar cálculos