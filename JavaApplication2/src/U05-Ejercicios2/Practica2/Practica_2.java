//Ejercicio 4 Practica 2. Fernando Pérez Andrés 
package Practica2;


public class Practica_2 {
    public static void main(String args[]){
        Asignatura Matematicas=new Asignatura();
        Asignatura Lengua=new Asignatura();
        Asignatura Ingles=new Asignatura();
        
        Matematicas.Asignatura(1110);
        Lengua.Asignatura(1111);
        Ingles.Asignatura(1112);
        
        Alumno alumno=new Alumno();
        alumno.Alumno(Matematicas, Lengua, Ingles);
        
        Profesor profesor=new Profesor();
        profesor.ponerNota(alumno);
        
        System.out.println("----- Boletin de Notas -----");
        System.out.println("");
        System.out.println("Nota Matematicas: "+ alumno.getAsigatura1().getCalificacion());
        System.out.println("Nota Lengua: "+ alumno.getAsigatura2().getCalificacion());
        System.out.println("Nota Ingles: "+ alumno.getAsigatura3().getCalificacion());
        System.out.println("");
        System.out.println("El Alumno tiene una média de :"+profesor.calcularMedia(alumno));
        
        
        
    }
}
