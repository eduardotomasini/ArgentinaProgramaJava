
package argentinaprograma.ej_15_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        //Cuenta cuenta = new Cuenta("Juan", 2335555 );
        Cuenta cuenta = new Cuenta();

        System.out.println("ingrese su nombre");
        cuenta.setTitular(leer.next());

        System.out.println("ingrese un monto");
        cuenta.ingresar(leer.nextFloat());

        System.out.println("el saldo en la cuenta es: " + cuenta.getSaldo());

        System.out.println("ingrese monto a retirar");
        cuenta.retirar(leer.nextFloat());

        System.out.println("===============================================\n"
                + "El titular de la Cuenta es: " + cuenta.getTitular() + "\n"
                + "El saldo en la cuenta es: " + cuenta.getSaldo());
        
        
        // System.out.println(cuenta.toString());
    }

}
