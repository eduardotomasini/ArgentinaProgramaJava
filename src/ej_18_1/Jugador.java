
package ej_18_1;

public class Jugador extends Seleccion{
    int nroJugador;
    String posicion;
    String estado;

    public Jugador() {
    }

    public Jugador(int nroJugador, String posicion, String estado, String nombre, String apellido, int edad, String pais) {
        super(nombre, apellido, edad, pais);
        this.nroJugador = nroJugador;
        this.posicion = posicion;
        this.estado = estado;
    }

    public int getNroJugador() {
        return nroJugador;
    }

    public void setNroJugador(int nroJugador) {
        this.nroJugador = nroJugador;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Jugador{" +"nombre=" + nombre + ", "
                + "apellido=" + apellido + ", "
                + "edad=" + edad + ", "
                + "pais=" + pais + ", "
                +"nroJugador=" + nroJugador + ", "
                + "posicion=" + posicion + ", "
                + "estado=" + estado + '}';
    }
    
    
    
    void jugarPartido (){
        
    }
    
    void entrenar (){
        
    }
    
}
//•	nroJugador
//•	posición
//•	estado(titular o suplente)
//y los métodos
//•	jugarPartido
//•	entrenar