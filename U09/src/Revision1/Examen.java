
package Revision1;

public class Examen {
    
    private String asignatura;
    private String aula;
    private Fecha fecha;
    private Hora hora;
    
    public Examen(){
        asignatura="";
        aula="";
        fecha=new Fecha();
    }

    public Examen(String asignatura, String aula, Fecha fecha, Hora hora) {
        this.asignatura = asignatura;
        this.aula = aula;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public String getAula() {
        return aula;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Hora getHora() {
        return hora;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }
    
    public String toString(){
        String str = "El examen de "+asignatura+" es en el aula "+aula+" el día "+fecha+" a las "+hora;
        return str;
    }
}
