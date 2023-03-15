
package ej_16_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Producto producto = new Producto();
        
        System.out.println("ingrese nombre del producto");
        producto.setNombre(leer.next());
        
        System.out.println("precio");
        producto.setPrecio(leer.nextInt());
        
        System.out.println("descripcion");
        producto.setDescripcion(leer.next());
        
        producto.verificarCosto();
        producto.calcularDescuento();
        producto.mostrarInfo();
    }
    
}
