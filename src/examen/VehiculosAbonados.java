
package examen;


public class VehiculosAbonados extends Vehiculo{
    
    final int costoEstadia = 2;

    public VehiculosAbonados() {
    }

    public VehiculosAbonados(String horaIngreso, String HoraSalida, String patente) {
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

    @Override
    public String toString() {
        return "VehiculosAbonados{" + "costoEstadia=" + costoEstadia + '}';
    }

 
    
    void CalcularEstadia (long minutos){
        System.out.println("la estadia para un Vehiculo Abonado es:"
                + "\n" + minutos*costoEstadia);
        
    }
    
    
    
}


//ii. Vehículos Abonados: Estos vehículos pagan a fin de mes a razón de $2 por minuto, de
//modo que el sistema debe ir acumulando la cantidad de minutos que estuvieron en el
//garaje durante el mes.