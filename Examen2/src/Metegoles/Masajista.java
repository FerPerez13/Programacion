
package Metegoles;


public class Masajista extends SeleccionFutbol{
    
    private String titulacion;
    private int aniosExperiencia;

    public Masajista() {
        super();
        this.titulacion = "";
        this.aniosExperiencia = 0;
    }

    public Masajista(String titulacion, int aniosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    
    public void darMasaje(){
        System.out.println("Dando masaje de recuperación");
    }
    
    
    
}
