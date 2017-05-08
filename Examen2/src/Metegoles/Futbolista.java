
package Metegoles;


public class Futbolista extends SeleccionFutbol{
    
    private int dorsal;
    private String demarcacion;

    public Futbolista(int dorsal, String demarcacion) {
        super();
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    // Metodos clase Futbolista
    
    public void jugarPartido(){
        System.out.println("Jugando partido");
    }
    public void entrenar(){
        System.out.println("Entrenando para ser cada día mejor");
    }
    
}
