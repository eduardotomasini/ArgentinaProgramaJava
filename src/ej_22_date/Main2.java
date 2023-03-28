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
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("30999444", "Rodriguez", "Roberto", "1984-05-08");
        Persona persona2 = new Persona("35666777", "Garcia", "Maria", "1980-07-29 ");

    }
    
}
//5- Escribir una clase Persona con los siguientes atributos numeroDocumento, 
// apellido, nombre y fechaNacimiento.

//6- Del ejercicio anterior, crear 2 objetos de Persona e imprimir quien es mayor de edad.

//7- Realizar un metodo llamado diasTranscurridos que devuelva los días que transcurrieron
//desde la fecha del cumpleaños en la c0ase Persona.