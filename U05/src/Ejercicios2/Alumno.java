// Ejercicio 2 Practica 2. Fernando Pérez Andrés
package Ejercicios2;

public class Alumno {
    private Asignatura As1=new Asignatura();
    private Asignatura As2=new Asignatura();
    private Asignatura As3=new Asignatura();
    
    public void Alumno(Asignatura a1, Asignatura a2, Asignatura a3){
        // Se inicializan las asignaturas introducidas en el constructor
        As1=a1;
        As2=a2;
        As3=a3;
    }
    
    public void Alumno(int n1, int n2, int n3){
        //El alumno se matricula de las siguientes 3 asignaturas
        As1.Asignatura(n1);
        As2.Asignatura(n2);
        As3.Asignatura(n3);        
    }
    
    public Asignatura getAsigatura1(){
        return As1;
    }
    public Asignatura getAsigatura2(){
        return As2;
    }
    public Asignatura getAsigatura3(){
        return As3;
    }
}
