/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_20;

import java.util.ArrayList;
import java.util.Scanner;

public class Persona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    String nombre;
    String apellido;
    String direccion;
    int edad;
    String dni;
    
    public Persona() {
    }
    
    public Persona(String nombre, String apellido, String direccion, int edad, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.dni = dni;
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
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre= " + nombre + ", "
                + "apellido= " + apellido + ", "
                + "direccion= " + direccion + ", "
                + "edad= " + edad + ", "
                + "dni= " + dni + '}';
    }
    
    Persona crearPersona() {
        
        Persona p1 = new Persona();
        
        System.out.println("ingrese persona");
        System.out.println("nombre");
        p1.setNombre(leer.next());
        System.out.println("apellido");
        p1.setApellido(leer.next());
        System.out.println("direccion");
        p1.setDireccion(leer.next());
        System.out.println("edad");
        p1.setEdad(leer.nextInt());
        System.out.println("dni");
        p1.setDni(leer.next());
        
        return p1;
}
    
}
