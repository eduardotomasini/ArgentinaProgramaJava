
package argentinaprograma;

import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        int opc;
        double radio;
        double base;
        double pi = (double) (Math.PI);
        double area;
        
        System.out.println("ingrese una opcion"
                + "\n 1: calcule area del circulo"
                + "\n 2: calcule area del cuadrado"
                + "\n 3: calcule el area de un triangulo");
        
        opc= leer.nextInt();
        
        switch (opc){
            case 1:
                System.out.println("ingrese el radio");
                radio = leer.nextDouble();
                
                area = pi*Math.pow(radio, 2);
                //System.out.printf("%n el area es %.2f" + area);
                System.out.printf("%n el area es %.2f", area);
                break;
            case 2:
                System.out.println("ingrese lado ");
                base = leer.nextDouble();
                area = Math.pow(base, 2);
                System.out.println(area);
               break;
            case 3:
                System.out.println("ingrese base");
                base = leer.nextDouble();
                System.out.println("ingrese altura");
                double alt = leer.nextDouble();
                area = (base*alt)/2;
                System.out.println("base por altura " + area);
        }
                
        
    }
    
}
