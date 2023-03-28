
package Clase22;

import java.util.Scanner;

public class Main_ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String[] nombres = new String[10];
        float[] notas = new float[10];

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("ingrese nombre");
            nombres[i] = leer.next();
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println("ingrese nota");
            notas[i] = leer.nextFloat();

            while (notas[i] <= 0 || notas[i] > 10) {
                System.out.println("ingrese una nota correcta");
                notas[i] = leer.nextFloat();
            }

        }

        for (int i = 0; i < nombres.length; i++) {
            if (notas[i] >= 1 && notas[i] < 4) {
                System.out.println("el alumno " + nombres[i] + " recursa la materia " + notas[i]);
            } else if (notas[i] >= 4 && notas[i] < 7) {
                System.out.println("el alumno " + nombres[i] + " aprobado rinde final " + notas[i]);
            } else if (notas[i] >= 7 && notas[i] <= 10) {
                System.out.println("el alumno " + nombres[i] + " promociona la materia " + notas[i]);
            }

        }
    }

}



//Crear dos vectores de 10 posiciones cada uno en uno se ingresarán los nombres de los alumnos 
//y en el otro las notas (debemos controlar que sea del 1 al 10). 

//El programa deberá avisar el nombre del alumno y su situación considerando los siguiente:
//• Si la nota esta entre 1 y 3,99 recursa la materia
//• Entre 4 y 6,99 aprobado, rinde final
//• Entre 7 y 10 promociona la materia