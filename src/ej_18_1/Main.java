/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_18_1;

import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Seleccion seleccion = new Seleccion("Juan", "Garcia", 22, "Argentina");

        Jugador jugador = new Jugador(10, "delantero", "titular", "Lio", "Messi", 37, "Argentina");

        Entrenador entrenador = new Entrenador("Lio", "Scaloni", 45, "Argentina");

        //System.out.println(seleccion.toString());
        System.out.println(jugador.toString());
        System.out.println(entrenador.toString());

        System.out.println("ingrese nueva edad del jugador");
        jugador.setEdad(leer.nextInt());

        System.out.println(jugador.toString());

        
    }
    
}

//1.	Crear la clase selección con los siguientes atributos:
//•	Nombre
//•	Apellido 
//•	Edad
//•	País

//Y los siguientes métodos que devuelvan un void: 
//•	Concentrarse
//•	Viajar

//2.	Crear una clase jugador que herede de selección sus atributos y que contenga:
//•	nroJugador
//•	posición
//•	estado(titular o suplente)
//y los métodos
//•	jugarPartido
//•	entrenar

//3.	Crear una clase entrenador que herede de selección sus atributos
//Y los métodos
//•	dirigirPartido
//•	dirigirEntrenamiento