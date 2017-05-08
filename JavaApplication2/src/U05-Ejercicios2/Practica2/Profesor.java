// Ejercicio 3 Practica 2. Fernando Pérez Andrés
package Practica2;

public class Profesor {
    
    public void ponerNota(Alumno alum){
        double nota1=(Math.random()*10);
        double nota2=(Math.random()*10);
        double nota3=(Math.random()*10);
        
        alum.getAsigatura1().Calificacion(nota1);
        alum.getAsigatura2().Calificacion(nota2);
        alum.getAsigatura3().Calificacion(nota3);
    }

    public double calcularMedia(Alumno alum){
        double media;
        double n1=alum.getAsigatura1().getCalificacion();
        double n2=alum.getAsigatura2().getCalificacion();
        double n3=alum.getAsigatura3().getCalificacion();
        media = (n1+n2+n3)/3;
        return media;
    }
}
