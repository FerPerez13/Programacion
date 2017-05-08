//Ejercicio 1 Practica 2. Fernando Pérez Andrés

package Practica2;

public class Asignatura {
    private int id;
    private double calificacion;
    
    public void Asignatura(int id){
        this.id=id;
        this.calificacion=0;
    }
    public void Calificacion(double nota){
        this.calificacion=nota;
    }
    public int getId(){
        return id;
    }
    public double getCalificacion(){
        return calificacion;
    }
}
