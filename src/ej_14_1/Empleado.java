
package ej_14_1;

import java.util.Scanner;

public class Empleado {
    Scanner leer = new Scanner(System.in);
    
    float sueldo;

    public Empleado() {
    }

    public Empleado(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    // metodos
    
     void calcularPromedioSueldo (){
         int cont520 = 0;
         int cont780 = 0;
         int contMas780 = 0;
         int sueldos = 0;
         float promedioSueldo;
         
         do {
             System.out.println("ingrese sueldo");
             sueldo = leer.nextFloat();
             
             if (sueldo<520 && sueldo!=0) {
                 sueldos += sueldo;
                 cont520 ++;

             } else if (sueldo>=520 && sueldo<780){
                 cont780++;
                 sueldos += sueldo;
             } else if (sueldo>=780 && sueldo!=0){
                 contMas780++;
                 sueldos += sueldo;
             }
             
         } while (sueldo!=0);
         
         promedioSueldo = sueldos/(cont520+cont780+contMas780);
         System.out.println("cobran menos de 520: " + cont520);
         System.out.println("cobran mas de 520 y menos de 780: " + cont780);
         System.out.println("cobran mas de 780: " + contMas780);
         
         System.out.println("\nel promedio de sueldo es: " + promedioSueldo);
         
     }
    
}

//Dado un conjunto de valores c/u de los cuales representa el sueldo de un empleado, 
//excepto el último que es cero e indica fin del conjunto. 
//
//Desarrollar el programa que determine e imprima:
//a. Cuantos empleados ganan menos de $520
//b. Cuantos ganan $520 o más pero menos de $780
//c. Promedio de sueldos