
package ej_21;

import java.util.Scanner;
import java.util.Vector;


public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[][] vector = new int[2][5];
        int contPar = 0;

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                vector[i][j] = leer.nextInt();
                if (vector[i][j] % 2 == 0) {
                    contPar++;
                }
            }
        }

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                System.out.println(" " + vector[i][j]);
            }
        }

        System.out.println("la cantidad de numeros pares es " + contPar);

        int[][] vector3 = new int[3][5];
        int sumaVector = 0;
        int prodVector = 1;
        int contCeros = 0;
        int contPositivos = 0;

        for (int i = 0; i < vector3.length; i++) {
            for (int j = 0; j < vector3[i].length; j++) {
                System.out.println("ingrese valores");
                vector3[i][j] = leer.nextInt();

                sumaVector += vector3[i][j];
                prodVector *= vector3[i][j];
                if (vector3[i][j] == 0) {
                    contCeros++;
                }
                if (vector3[i][j] > 0) {
                    contPositivos++;
                }
            }
        }

        System.out.println("la suma es " + sumaVector + ""
                + "\nla multiplicacion es " + prodVector);

        for (int i = 0; i < vector3.length; i += 2) {
            for (int j = 0; j < vector3[i].length; j++) {

                System.out.println("vector mod " + vector3[i][j]);

            }
        }

        System.out.println("cantidad de ceros: " + contCeros + ""
                + "\n cantidad de Positivos: " + contPositivos);

        Vector<Integer> vector4 = new Vector();

        int sumaVector4 = 0;
        int prodVector4 = 1;
        int contCero4 = 0;
        int contPos4 = 0;
        int contNeg4 = 0;
        int cont = 0;

        for (int i = 0; i < 15; i++) {
            vector4.add(leer.nextInt());
        }

        for (int i = 0; i < vector4.size(); i++) {
            sumaVector4 += vector4.get(i);
            prodVector4 *= vector4.get(i);
            cont++;
            if (vector4.get(i) == 0) {
                contCero4++;
            } else if (vector4.get(i) > 0) {
                contPos4++;
            } else if (vector4.get(i) < 0) {
                contNeg4++;
            }
        }

        System.out.println("la suma es " + sumaVector4 + ""
                + "\n el producto es: " + prodVector4 + ""
                + "\n ceros: " + contCero4 + ""
                + "\npositivos: " + contPos4 + ""
                + "\nnegativos: " + contNeg4 + ""
                + "\npromedio: " + sumaVector4 / cont);

    }

}

//Crear un vector de 10 elementos, ingresar los datos por teclado y 
//calcular el número de números pares ingresados, 
//calcular la suma total y mostrar el vector por pantalla
//Ingresar 15 valores en un vector y calcular:
//La suma de todos los numeros
//El producto de toso los elementos
//Mostrar los componentes de indice par
//Cantidad de ceros, pos
