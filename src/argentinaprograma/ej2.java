
package argentinaprograma;

import static java.lang.Math.PI;
import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {
    //Ingresar 5 notas y calcular cuantos aprobados y desaprobados hay, y calcula su promedio

    Scanner leer = new Scanner(System.in);
    
        int notas = 5;
        int num;
        int suma = 0;
        double prom;
        
        double pi = (double)(Math.PI);
        
        for (int i = 0; i < notas; i++) {
            num = leer.nextInt();
            suma = num + suma;
        }
            
        System.out.print(pi);
        
        prom = suma / notas;

        if (prom < 4) {
            System.out.println("desaprobo");
        } else if (prom >= 4 || prom > 7) {
            System.out.println("saco entre 4 y 7, nota: " + prom);
        } else {
            System.out.println("el promedio es " + prom);
        }
    }
}
