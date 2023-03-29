
package examen;

import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Principal {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Date horaActual = new Date();
          
        VehiculoOficial vehiculoOficial = new VehiculoOficial();
        VehiculosNoAbonados vehiculoNoAbonado = new VehiculosNoAbonados();
        VehiculosAbonados vehiculoAbonado = new VehiculosAbonados();
        
        int opc;

        do {
            System.out.println("ingrese que tipo de vehiculo "
                    + "\n vehiculo Oficial = 1"
                    + "\n vehiculo Abonado = 2"
                    + "\n vehiculo No Abonado = 3");
            opc = sc.nextInt();
            
        } while (opc > 3);
        
        System.out.println("ingrese dia de ingreso");
        int diaIngreso = sc.nextInt();
        
        System.out.println("ingrese hora de ingreso");
        int horaIngreso = sc.nextInt();
        
        System.out.println("ingrese minutos de ingreso");
        int minutosIngreso = sc.nextInt();
        
        // en este Date , dejo seteado con '123' el año y con el '2' el mes
        Date estadia = new Date (123, 2, diaIngreso, horaIngreso, minutosIngreso);
    
        long tiempoTranscurrido = horaActual.getTime() - estadia.getTime();
        
        TimeUnit unidadM = TimeUnit.MINUTES;
        
        //TimeUnit unidadH = TimeUnit.HOURS;
        
        System.out.println("tiempo transcurrido " + tiempoTranscurrido);
        
        long minutos = unidadM.convert(tiempoTranscurrido, TimeUnit.MILLISECONDS);
        //long horas = unidadH.convert(tiempoTranscurrido, TimeUnit.MILLISECONDS);
        
        //System.out.println("las horas son "+  horas);
        System.out.println("los minutos son: " + minutos);
        
        switch(opc){
            case 1:
                vehiculoOficial.CalcularEstadia(minutos);
                break;
            case 2:
               vehiculoAbonado.CalcularEstadia(minutos);
                break;
            case 3:
                vehiculoNoAbonado.CalcularEstadia(minutos);
            
        }
        
    }
    
}

//Se desea desarrollar un sistema para gestionar la entrada y salida de vehículos a una cochera de
//las siguientes características:


//b. Existen distintos tipos de vehículos, y para cada uno de estos tipos un modo diferente de
//cobranza, a saber:

//iv. Más allá de los tres tipos anteriores se prevé que en un futuro cercano se incorporarán
//al sistema nuevos tipos de vehículos, por lo que el diseño deberá permitir una fácil
//extensión del sistema en ese aspecto.