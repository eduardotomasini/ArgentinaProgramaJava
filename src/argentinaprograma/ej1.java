
package argentinaprograma;

import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int num1;
        int num2;
        
        int suma;
        int resta;
        int factor;
        
        System.out.println("num1");
        num1 = leer.nextInt();
        System.out.println("num2");
        num2 = leer.nextInt();
        
        suma = num1+num2;
        resta = num1-num2;
        factor = num1*num2;
        
        System.out.println("la suma es: " + suma + "\n" + 
                "la resta es: " + resta + "\n" +
                "la multiplicacion es: " + factor);
      
    }
    
}
