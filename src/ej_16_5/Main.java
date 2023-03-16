/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_16_5;

/**
 *
 * @author eduar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Pasajero pasajero = new Pasajero();
        Pasajero pasajero1 = new Pasajero("Juan", "Gomez", "16335245", 54, "Los Pozos 566", "Gualmayen", "Mendoza");
        Pasajero pasajero2 = new Pasajero("Maria", "Perez", "23546987", 49, "Juncal 55", "Rio Cuarto", "Cordoba");
        Pasajero pasajero3 = new Pasajero("Pablo", "Fernandez", "35126356", 35, "Piedra Buena 66", "Bahia Blanca", "Buenos Aires");
        Pasajero pasajero4 = new Pasajero("Ester", "Garcia", "45986124", 19, "Arenales 98", "Adrogue", "Buenos Aires");
        Pasajero pasajero5 = new Pasajero("Camila", "Gimenez", "30968784", 38, "Hipolito Irygoyen 46", "Salta", "Salta");
        Pasajero pasajero6 = new Pasajero("Roberto", "Gonzalez", "11548635", 22, "Las Piedras 1966", "La Paz", "Entre Rios");
        
        
        pasajero.identicarPasajerosMayores(pasajero1, pasajero2, pasajero3, pasajero4, pasajero5, pasajero6);
        pasajero.imprirmirPasajerosMenores(pasajero1, pasajero2, pasajero3, pasajero4, pasajero5, pasajero6);
        
        
        System.out.println(pasajero1.toString());
        System.out.println(pasajero2.toString());
        System.out.println(pasajero3.toString());
        System.out.println(pasajero4.toString());
        System.out.println(pasajero5.toString());
        System.out.println(pasajero6.toString());

        
    }
    
}
