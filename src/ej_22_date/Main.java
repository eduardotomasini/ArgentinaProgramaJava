
package ej_22_date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;



public class Main {

    public static void main(String[] args) {
        String fechaDeCumple = "1984-05-08";
        
        LocalDate fechaLocal = LocalDate.now();
        
        LocalTime horaLocal = LocalTime.now();

        System.out.println("hora " + horaLocal);
        System.out.println("fecha " + fechaLocal);
      
        LocalDate fecha = LocalDate.parse(fechaDeCumple, DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println("fecha de cumple " + fecha);
        
        System.out.println(fecha.getDayOfMonth());
        System.out.println(fecha.getMonth());
        System.out.println(fecha.getYear());

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime()); // imprime la fecha y hora actual
        cal.add(Calendar.DATE, 7);
        System.out.println(cal.getTime()); // imprime la fecha y hora actual más una semana 
        
        
    }

}
//1- Imprimir la fecha actual
//2- Imprimir la hora actual

//3- Ingresar en cadena de caracteres la fecha de su cumpleaños 
// y transformarlas a LocalDate.

//4- Ingresar una fecha y sumarle 7 días.
//5- Escribir una clase Persona con los siguientes atributos numeroDocumento, 
// apellido, nombre y fechaNacimiento.

//6- Del ejercicio anterior, crear 2 objetos de Persona e imprimir quien es mayor de edad.
//7- Realizar un metodo llamado diasTranscurridos que devuelva los días que transcurrieron
//desde la fecha del cumpleaños en la clase Persona.