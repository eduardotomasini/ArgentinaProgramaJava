
package ej_20;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int[] num = new int[10];
        
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (10 * Math.random() + 1);
        }
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("num " + i + " = " + num[i]);
        }

        String[] nombres = {"Juan", "Pablo", "Maria", "Juana", "Filomena"};

        for (String nom : nombres) {
            System.out.println(nom);
        }

        Persona personaListado[] = new Persona[5];

        personaListado[0] = new Persona("Pablo", "Garcia", "Irigoyen", 32, "32222");
        personaListado[1] = new Persona("Maria", "Garcia", "Irigoyen", 32, "32222");
        personaListado[2] = new Persona("Juan", "Garcia", "Irigoyen", 32, "32222");
        personaListado[3] = new Persona("Martin", "Garcia", "Irigoyen", 32, "32222");
        personaListado[4] = new Persona("German", "Garcia", "Irigoyen", 32, "32222");

        for (int i = 0; i < personaListado.length; i++) {
            System.out.println(personaListado[i]);
        }
        
        ArrayList<Integer> num3 = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            num3.add((int)(10* Math.random()+1));
        }
        
        for (int i = 0; i < num3.size(); i++) {
            System.out.println(i + " num es " + num3.get(i));
        }
 
        num3.remove(3);

        num3.add(88);
        num3.add(66);
        
          for (int i = 0; i < num3.size(); i++) {
            System.out.println(i + " num es " + num3.get(i));
        }
        
        Persona persona = new Persona();
        ArrayList<Persona> personaArray = new ArrayList<>();

        boolean otraPersona = false;
        
        do {
            personaArray.add(persona.crearPersona());
            System.out.println("desea ingresar otra persona");
            String otraPers =  leer.next().toUpperCase();
            if (!otraPers.equals("SI")) {
                otraPersona = true;
            }
        } while (otraPersona==false);
     
        
//        for (Persona persona1 : personaArray) {
//            System.out.println(persona1);
//        }
        
        for (int i = 0; i < personaArray.size(); i++) {
            System.out.println(personaArray.get(i) + " " + i);
        }




        
        
    }
    
}



//1- Crear un array de enteros del 1 al 10. Recorrer el array.
//2- Crear un array de String con 5 nombres. recorrer el array.
//3- Crear un array de números aleatorios del 1 al 6 y mostrar cuántas veces salió cada
//número.
//4. Crear un array de Persona, al menos 5 objetos y mostrar el listado
//5- Crear una lista de enteros del 1 al 10. Recorrer la Lista - Eliminar la posición 3 - Agregar
//dos enteros más.
//6- Crear una lista de Personas con al menos 5 objetos - Mostrar la lista- agregar dos
//objetos más y eliminar los dos primeros