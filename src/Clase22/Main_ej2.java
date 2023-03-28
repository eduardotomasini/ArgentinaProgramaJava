
package Clase22;

import java.util.Scanner;


public class Main_ej2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        
        System.out.println("defina el numero de columnas");
        int n = leer.nextInt();
      
        int[][] matriz = new int[5][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[1].length; j++) {
                matriz[i][j] = (int) (100 * Math.random() + 1);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("psn i " + i+ " j " + j+" "+ matriz[i][j]);
            }
        }

    }

}
//Crear una matriz de 5 filas y n columnas (se pide al usuario el n). 
//Rellenar la matriz con numero aleatorios del 1 al 100 y mostrarla por pantalla