
package Clase22;

public class Main_ej3 {

    public static void main(String[] args) {
        String cadena = "James Gosling creo java";
        int contJ = 0;
        System.out.println("longitud " + cadena.length());

        for (int i = 0; i < cadena.length(); i++) {
            
            System.out.println("letra x letra= " + cadena.charAt(i) );
            
            if (cadena.charAt(i) == 'j') {
                contJ++;
            }
            
        }
        
        System.out.println(cadena.contains("James Gosling"));

        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());
        
       
        // me falto ... • Mostrar solamente “James Gosling”
        //System.out.println(cadena.contains("James Gosling"));

        System.out.println(cadena.replace("java", "Python"));

        System.out.println("cantidad de Jotas " + contJ);
    }
    
}

//Crear el String “James Gosling creo java” y mostrar por pantalla:
//• La longitud del String
//• La frase letra por letra
//• Mostrar solamente “James Gosling”
//• La frase toda en minúscula y toda en mayúscula
//• Cambiar Java por Python
//• Calcular cuantas veces aparece la letra j