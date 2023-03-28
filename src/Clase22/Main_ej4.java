
package Clase22;

import java.util.ArrayList;

public class Main_ej4 {

 
    public static void main(String[] args) {
     
        ArrayList<String> frutas = new ArrayList<String>();
        
        frutas.add("pera");
        frutas.add("manzana");
        frutas.add("banana");
        frutas.add("uva");
        frutas.add("ananá");
        
        frutas.add(0, "limon");
        frutas.add(frutas.size(), "frutillas");
        frutas.add(4, "sandia");
        
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        for (int i = 0; i < frutas.size(); i++) {
            if (frutas.get(i).equals("manzana")) {
                System.out.println("\nfrutas " + frutas.get(i));
            }
            if (frutas.get(i).equals("ananá")) {
                System.out.println("anana psn " + i );
            }
        }
        
        frutas.remove("manzana");
        
        frutas.remove(2);
        
        frutas.clear();
        
       

        // me falto .. Cambiar sandia por melón
        
    }

}

//Crear un ArrayList con las siguientes frutas: pera, manzana, banana, uva y ananá. Luego:
//• Agregar frutilla en última posición, limón en la primera posición y sandia en la posición 4
//• Comprobar que manzana se encuentra en la lista
//• Mostrar la posición del ananá
//• Borrar manzana
//• Cambiar sandia por melón
//• Borrar la fruta que está en la posición 2
//• Borrar toda la lista