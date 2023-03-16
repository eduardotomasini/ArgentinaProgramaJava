/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_16_5;

import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class Pasajero {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    String nombre;
    String apellido;
    String dni;
    int edad;
    String direccion;
    String ciudad;
    String provincia;

    public Pasajero() {
    }

    public Pasajero(String nombre, String apellido, String dni, int edad, String direccion, String ciudad, String provincia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    

    // metodos
    
//    public Pasajero crearPasajero (){
//    
//        Pasajero pasajero1 = new Pasajero();
//        
//        System.out.print("nombre: ");
//        pasajero1.setNombre(leer.next());
//   
//        System.out.print("apellido: ");
//        pasajero1.setApellido(leer.next());
//        
//        System.out.print("dni: ");
//        pasajero1.setDni(leer.next());
//        
//        System.out.print("edad: ");
//        pasajero1.setEdad(leer.nextInt());
//        
//        System.out.print("dirección: ");
//        pasajero1.setDireccion(leer.next());
//        
//        System.out.print("provincia: ");
//        pasajero1.setProvincia(leer.next());
//        
//        System.out.print("ciudad: ");
//        pasajero1.setCiudad(leer.next());
//        
//    return pasajero1;
//    }
 
    
    public void identicarPasajerosMayores (Pasajero pasajero1, Pasajero pasajero2, 
            Pasajero pasajero3, Pasajero pasajero4, Pasajero pasajero5, Pasajero pasajero6){
       
        int numMayor = 0;

        if (pasajero1.getEdad() > 0) {
            numMayor = pasajero1.getEdad();
        }
        if (pasajero2.getEdad() > numMayor) {
            numMayor = pasajero2.getEdad();
        }
        if (pasajero3.getEdad() > numMayor) {
           numMayor = pasajero3.getEdad();
        }
        if (pasajero4.getEdad() > numMayor) {
            numMayor = pasajero4.getEdad();
        }
        if (pasajero5.getEdad() > numMayor) {
            numMayor = pasajero5.getEdad();
        }
        if (pasajero6.getEdad() > numMayor) {
            numMayor = pasajero6.getEdad();
        }
        System.out.println("el mayor es " + numMayor);
    }
    
    void imprirmirPasajerosMenores (Pasajero pasajero1, Pasajero pasajero2, 
            Pasajero pasajero3, Pasajero pasajero4, Pasajero pasajero5, Pasajero pasajero6){
           int numMenor = 999;

        if (pasajero1.getEdad() < 0) {
            numMenor = pasajero1.getEdad();
        }
        if (pasajero2.getEdad() < numMenor) {
            numMenor = pasajero2.getEdad();
        }
        if (pasajero3.getEdad() < numMenor) {
           numMenor = pasajero3.getEdad();
        }
        if (pasajero4.getEdad() < numMenor) {
            numMenor = pasajero4.getEdad();
        }
        if (pasajero5.getEdad() < numMenor) {
            numMenor = pasajero5.getEdad();
        }
        if (pasajero6.getEdad() < numMenor) {
            numMenor = pasajero6.getEdad();
        }
        System.out.println("el menor es " + numMenor);
    }

    @Override
    public String toString() {
        return "Pasajero{" + "nombre= " + nombre + ", "
                + "apellido= " + apellido + ", "
                + "dni= " + dni + ", edad=" + edad + ", "
                + "direccion= " + direccion + ", "
                + "ciudad= " + ciudad + ", "
                + "provincia= " + provincia + '}';
    }
    
}
