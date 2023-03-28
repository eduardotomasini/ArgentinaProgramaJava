/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_22_date;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author eduar
 */
public class Persona {
    
    String dni;
    String apellido;
    String nombre;
    String fechaNacimiento;

    public Persona() {
    }

    public Persona(String dni, String apellido, String nombre, String fechaNacimiento) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
    
    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
    
}
//5- Escribir una clase Persona con los siguientes atributos numeroDocumento, 
// apellido, nombre y fechaNacimiento.

//6- Del ejercicio anterior, crear 2 objetos de Persona e imprimir quien es mayor de edad.

//7- Realizar un metodo llamado diasTranscurridos que devuelva los días que transcurrieron
//desde la fecha del cumpleaños en la clase Persona.