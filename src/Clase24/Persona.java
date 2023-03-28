/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase24;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Persona {
    Scanner leer = new Scanner(System.in);
    
    String numeroDocumento;
    String apellido;
    String nombre;
    String direccion;
    String fechaNacimiento;
    Ciudad ciudad;

    public Persona() {
    }

    public Persona(String numeroDocumento, String apellido, String nombre, String direccion, String fechaNacimiento, Ciudad ciudad) {
        this.numeroDocumento = numeroDocumento;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudad = ciudad;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return  "\nDNI= " + numeroDocumento + ", "
                + "\napellido= " + apellido + ", "
                + "\nnombre= " + nombre + ", "
                + "\ndireccion= " + direccion + ", "
                + "\nfecha de Nacimiento= " + fechaNacimiento + ", "
                + ciudad + "\n";
    }
    
    

    void calcularEdad(String fechaNacimiento) {
        LocalDate fechaActual = LocalDate.now();

        //fechaNacimiento= leer.next();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate fechaNac = LocalDate.parse(fechaNacimiento, format);

//      LocalDate fechaNac= LocalDate.parse(fechaNacimiento);
        // de esta forma tengo que ingresar yyyy-mm-dd
        long dias = ChronoUnit.DAYS.between(fechaNac, fechaActual);

        int diasInt = (int) dias;

        int edad = diasInt / 360;

        if (edad >= 18) {
            System.out.println("es mayor de edad " + edad);
        } else {
            System.out.println("es menor edad " + edad);
        }
     
    }

    void RecorrerCiudad(Ciudad ciudad) {

        if (ciudad.getNombre().equals("Buenos Aires")) {
            System.out.println("esta la ciudad " + ciudad.getNombre());
        }

    }
    
    
}



//1- Crear una Clase Persona con los atributos numeroDocumento, apellido, nombre,
//dirección, fechaNacimiento. Crear 10 objetos de la clase Persona,. imprimir la información
//de las personas, cuales son mayores de edad y menores.

// https://www.youtube.com/watch?v=62TywMl_BsA