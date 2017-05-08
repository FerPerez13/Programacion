
package Metegoles;


public class Entrenador extends SeleccionFutbol{
    
    private String idFederacion;

    public Entrenador() {
        super();
        this.idFederacion = "";
    }

    public Entrenador(String idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    public void dirigirPartido(){
        System.out.println("Dirigiendo al equipo hacia la victoria");
    }
    public void dirigirEntrenamiento(){
        System.out.println("Dirigiendo el entrenamiento");
    }
    
    
}
