

package ej_18_1;


public class Entrenador extends Seleccion{

    public Entrenador() {
    }

    public Entrenador(String nombre, String apellido, int edad, String pais) {
        super(nombre, apellido, edad, pais);
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
        return "Entrenador{" +"nombre=" + nombre + ", "
                + "apellido=" + apellido + ", "
                + "edad=" + edad + ", "
                + "pais=" + pais + '}';
    }

    
    
    
    void dirigirPartido() {

    }

    void dirigirEntrenamiento() {

    }

    
}
//•	dirigirPartido
//•	dirigirEntrenamiento