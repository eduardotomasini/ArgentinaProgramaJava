
package ej_16_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Libro libro = new Libro();
      
        System.out.println("ingrese año del libro");
        libro.calcularAntiguedad(leer.nextInt());
        
        
        System.out.println("ingrese cantidad de palabras");
        libro.calcularPaginas(leer.nextInt());
        
        System.out.println("cantidad de paginas " + libro.getCantPag());
    }
    
}
