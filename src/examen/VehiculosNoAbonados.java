
package examen;

public class VehiculosNoAbonados extends Vehiculo {
    final int costoEstadia = 4;

    public VehiculosNoAbonados() {
    }

    public VehiculosNoAbonados(String horaIngreso, String HoraSalida, String patente) {
        super(horaIngreso, HoraSalida, patente);
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

    void CalcularEstadia (long minutos){
        System.out.println("la estadia para un Vehiculo No Abonado es:"
                + "\n" + minutos*costoEstadia);
        
    }
    
}

//iii. Vehículos NO-Abonados: En este caso el vehículo paga $4 por minuto en el momento
//de retirarse del garaje.