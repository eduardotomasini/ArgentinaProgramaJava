/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase24;

import java.util.Date;

/**
 *
 * @author eduar
 */
public class Ciudad {
    String id;
    String nombre;
    

    public Ciudad() {
    }

    public Ciudad(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "\nCiudad= " + nombre ;
    }

    
}

//2- Crear una clase Ciudad con los siguientes atributos: id, nombre. agregar a la Clase
//Persona el atributo ciudad de tipo Ciudad. Luego por cada persona se le debera agregar el
//valor correspondiente a la ciudad.