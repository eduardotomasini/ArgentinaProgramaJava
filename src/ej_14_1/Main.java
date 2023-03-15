/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_14_1;

/**
 *
 * @author eduar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Empleado empleado = new Empleado();
     
     
     empleado.calcularPromedioSueldo();
     
     
    }
    
}

//Dado un conjunto de valores c/u de los cuales representa el sueldo de un empleado, 
//excepto el último que es cero e indica fin del conjunto. 
//
//Desarrollar el programa que determine e imprima:
//a. Cuantos empleados ganan menos de $520
//b. Cuantos ganan $520 o más pero menos de $780
//c. Promedio de sueldos