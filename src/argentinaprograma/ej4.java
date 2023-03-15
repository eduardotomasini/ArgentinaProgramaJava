package argentinaprograma;

import java.util.Scanner;

public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        int chances = 0;
        int num;
        boolean salir = true;
        
        int aleatorio = (int) (10 * Math.random() + 1);
        System.out.println("ale " + aleatorio);

        do {
            System.out.println("ingrese un numero");
            num = leer.nextInt();

            if (num == aleatorio) {
                System.out.println("encontro el numero");
                salir = false;
            } else {
                chances += 1;
            }

        } while (chances != 5 && salir == true);

        if (salir == true) {
            System.out.println("agoto sus oportunidades");
        }
    }

}
