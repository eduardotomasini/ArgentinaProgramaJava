/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_21_1;

import java.util.ArrayList;


/**
 *
 * @author eduar
 */
public class ej_21_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<String> dias = new ArrayList<>();
        
        dias.add("lunes");
        dias.add("martes");
        dias.add("miercoles");
        dias.add("jueves");
        dias.add("viernes");
        dias.add("sabado");
        dias.add("domingo");

        System.out.println("dias " + dias.toString());
        
        System.out.println("cantidad de elementos " + dias.size());
        
        //dias.set(4, "juernes");
        dias.add(4, "juernes");

        
        System.out.println("dias "+ dias.toString());
                
        System.out.println("primer día " + dias.get(0));
        System.out.println("ultimo día " + dias.get(dias.size()-1));
        
        for (int i = 0; i < dias.size(); i++) {
            if (dias.get(i).toString().equals("juernes")) {
                dias.remove(i);
            }
        }
        
        for (int i = 0; i < dias.size(); i++) {
            if (dias.get(i).toString().equals("lunes")) {
                System.out.println("existe el dia " + dias.get(i).toString() );
            }
        }
        
        System.out.println(dias.get(4).toString());
        
        dias.clear();
        
        System.out.println("dias" + dias.toString());
    }
    
}
//Crear una matriz que permita calcular el promedio de notas de 5 alumnos que cursan 3 materias.
// Adicionalmente se pide calcular cuál de ellos tiene el mejor promedio
//
//Crear una lista que contenga los dia de la semana
//Insertar en la posición 4 el elemento “Juernes”
//Mostrar el primer elemento y el último
//Mostrar la cantidad de elementos de la lista
//Eliminar el elemento “juernes” y mostrar la lista
//Buscar si existe el elemento “lunes”
//Borrar todos los elementos de la lista
