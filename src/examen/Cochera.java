
package examen;

public class Cochera {
    
    
    Vehiculo vehiculo;

    public Cochera() {
    }

    public Cochera(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Cochera{" + "vehiculo=" + vehiculo + '}';
    }

    
    
    
}
