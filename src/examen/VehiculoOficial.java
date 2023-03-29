
package examen;

public class VehiculoOficial extends Vehiculo {
    
    final int costoEstadia=0;

    public VehiculoOficial() {
    }

    public VehiculoOficial(String horaIngreso, String HoraSalida, String patente) {
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
        System.out.println("la estadia para un Véhiculo Oficial es:"
                + "\n" + minutos*costoEstadia);
        
    }
    
}

//i. Vehículos Oficiales: Estos vehículos no pagan, pero a efecto de control deben quedar
//registradas las estadías (cada estadía tiene una patente, una fecha-hora de entrada y
//una fecha-hora de salida)