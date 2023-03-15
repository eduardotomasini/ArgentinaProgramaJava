/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argentinaprograma.ej_15_1;

import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class Cuenta {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    String titular;
    float cantidad;
    float saldo;

    public Cuenta() {
    }

    public Cuenta(String titular, float cantidad, float saldo) {
        this.titular = titular;
        this.cantidad = cantidad;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + ", saldo=" + saldo + '}';
    }

    public float ingresar(float cantidad) {
        do {
            if (cantidad < 0) {
                System.out.println("ingreso un monto negativo"
                        + "\n ingrese un monto positivo");
                cantidad = leer.nextFloat();
            }
        } while (cantidad < 0);
        saldo = cantidad;
        return saldo;
    }

    public float retirar(float cantidad) {

        do {
            if (saldo < cantidad) {
                System.out.println("ingreso un monto mayor al que tiene en la cuenta");
                cantidad = leer.nextFloat();
            }
        } while (cantidad < 0);
        saldo = saldo - cantidad;
        return saldo;
    }
}


//Crea una clase llamada Cuenta que tendrá los siguientes atributos: 
//titular y cantidad (puede tener decimales).

//Crear métodos constructores
//Crea sus métodos get, set y toString.

//Tendrá dos métodos especiales:
//•	ingresar(double cantidad): se ingresa una cantidad a la cuenta, 
//si la cantidad introducida es negativa, no se hará nada.



//•	retirar(double cantidad): se retira una cantidad a la cuenta, 
//si restando la cantidad actual a la que nos pasan es negativa, 
//la cantidad de la cuenta pasa a ser 0.