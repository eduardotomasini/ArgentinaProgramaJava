/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author eduar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Ciudad ciudad1 = new Ciudad("11", "Buenos Aires");
        Ciudad ciudad2 = new Ciudad("22", "Córdoba");
        Ciudad ciudad3 = new Ciudad("33", "Salta");
        Ciudad ciudad4 = new Ciudad("44", "Entre Rios");
        Ciudad ciudad5 = new Ciudad("55", "Santa Fé");
        
        Persona persona = new Persona();
        Persona persona1 = new Persona("32444666", "Jimenez", "Roberta", "Congreso 988", "02-06-1986", ciudad1);
        Persona persona2 = new Persona("23666999", "Fernandez", "Facundo", "Roca 54", "02-06-1977", ciudad2);
        Persona persona3 = new Persona("48659125", "Gonzalez", "Maria", "Congreso", "02-06-2008", ciudad3);
        Persona persona4 = new Persona("17745856", "Garcia", "Camila", "Combate de los Posos 1844", "02-06-1965", ciudad4);
        Persona persona5 = new Persona("52648315", "Mamani", "Filomena", "Rivadavia 3540", "02-06-2018", ciudad5);
       
        List<Persona> listaPersonas = new ArrayList<>();
        
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);
        
        for (Persona listaPersona : listaPersonas) {
            // modifique el toString
            System.out.println("lista de Personas " + listaPersona.toString());
        }
        
        for (int i = 0; i < listaPersonas.size(); i++) {
            // creo un objeto de la clase Persona sin atributos para poder llamar al metodo
            // una vez que lo llamo, le paso como parametros la fecha de nacimiento de las personas creadas
            // y me arroja si son mayores de edad o no
            persona.calcularEdad(listaPersonas.get(i).getFechaNacimiento());
            
            // recorro cada Objeto de la clase persona
            persona.RecorrerCiudad(listaPersonas.get(i).ciudad);

            // sin llamar al metodo recorro la Lista
            if (listaPersonas.get(i).getCiudad().getNombre().equals("Córdoba")) {
                System.out.println("esta la Ciudad " + listaPersonas.get(i).getCiudad().nombre);

            }
            
            if (listaPersonas.get(i).nombre.startsWith("M")) {
                System.out.println("personas que empiezan con 'M' = "
                        + listaPersonas.get(i).getNombre());
            }

        }

        
        
    }
    
}


//1- Crear una Clase Persona con los atributos numeroDocumento, apellido, nombre,
//dirección, fechaNacimiento. Crear 10 objetos de la clase Persona,. imprimir la información
//de las personas, cuales son mayores de edad y menores.
//2- Crear una clase Ciudad con los siguientes atributos: id, nombre. agregar a la Clase
//Persona el atributo ciudad de tipo Ciudad. Luego por cada persona se le debera agregar el
//valor correspondiente a la ciudad.

//3- Imprimir la informacion completa de la Persona e identificar quienes viven en las
//ciudades de Buenos Aires, Córdoba, etc.

//4- Ordenar las personas por mayor y por menor.

//5- Buscar las personas que empiezan con la letra M.