
package examen;

public class Vehiculo {
    
    String horaIngreso;
    String HoraSalida;
    String patente;

    public Vehiculo() {
    }

    public Vehiculo(String horaIngreso, String HoraSalida, String patente) {
        this.horaIngreso = horaIngreso;
        this.HoraSalida = HoraSalida;
        this.patente = patente;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(String HoraSalida) {
        this.HoraSalida = HoraSalida;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "horaIngreso=" + horaIngreso + ", HoraSalida=" + HoraSalida + ", patente=" + patente + '}';
    }
    
}
