/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_21_1;

/**
 *
 * @author eduar
 */
public class Main {

    public static void main(String[] args) {
        int[] auto = new int[10];

        int aux;
        int max = auto[0];
        int min= auto[0];

        for (int i = 0; i < auto.length; i++) {
            auto[i] = (int) (1000 * Math.random() + 1);

        }

        for (int i = 0; i < auto.length; i++) {
            System.out.println("autos " + auto[i]);
        }
        
        for (int i = 0; i < (auto.length-1); i++) {
            
            if (auto[i]>auto[i+1]) {
                max = auto[i];
            }
            if(auto[i]<auto[i+1]){
                min= auto[i];
            }
        }
        System.out.println("\nmaximo "+ max + "\n"
                + "\nminimo " + min + "\n");
        
        
        // Método Burbuja
        for (int i = 0; i < (auto.length-1); i++) {
            for (int j = 0; j < (auto.length-1); j++) {
                if (auto[j] > auto[j + 1]) {
                    aux = auto[j];
                    auto[j] = auto[j + 1];
                    auto[j + 1] = aux;

                }
            }
        }

        for (int i = 0; i < auto.length; i++) {
            System.out.println("autos " + auto[i]);
        }

        
       
    }
    
}

//En una carrera automovilistica corren 10 auto numersados del 1 al 10.
// Ingresar los tiempo alcanzados por cada uno y calcular:
//Cual fue el auto que llego primero
//Cual fue el auto que llego ultimo
//Cuantos minutos tarde en llegar el auto numero 5