
package argentinaprograma.tp12_1;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class ej12_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
       
        
        // atributos
        String est;
        
        System.out.println("ingrese dia de ingreso");
        int diaIngreso = leer.nextInt();
        
        System.out.println("ingrese hora de ingreso");
        int horaIngreso = leer.nextInt();
        
        System.out.println("ingrese minutos de ingreso");
        int minutosIngreso = leer.nextInt();
        
        Date estadia = new Date (123, 2, diaIngreso, horaIngreso, minutosIngreso);
        
        Date horaActual = new Date();
        

        //System.out.println(estadia);
        
        
        long tiempoTranscurrido = horaActual.getTime() - estadia.getTime();
        
        TimeUnit unidadM = TimeUnit.MINUTES;
        
        TimeUnit unidadH = TimeUnit.HOURS;
        
        System.out.println("tiempo transcurrido " + tiempoTranscurrido);
        
        long minutos = unidadM.convert(tiempoTranscurrido, TimeUnit.MILLISECONDS);
        long horas = unidadH.convert(tiempoTranscurrido, TimeUnit.MILLISECONDS);
        
        
        System.out.println("las horas son "+  horas);
        System.out.println("los minutos son: " + minutos);
        
        
        
        
        
        
        
    }

  
    
}


// https://www.youtube.com/watch?v=BUHu-FHJU6E

// https://www.youtube.com/watch?v=LAMPrdvriUE