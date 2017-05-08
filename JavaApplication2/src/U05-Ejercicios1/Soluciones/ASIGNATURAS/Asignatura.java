/*2.- Escribe un programa que disponga de una clase para representar las asignaturas de una carrera:
 Una asignatura tiene un nombre, un código numérico y el curso en el cual se imparte
 Los valores iniciales han de proporcionarse en el constructor
 La clase ha de tener métodos para obtener los valores de los atributos
 El programa ha de construir un objeto con los siguientes valores: nombre “Matemáticas”, código 1017, curso 1.
 A continuación, el programa ha de imprimir los valores del objeto por pantalla*/
package ASIGNATURAS;

public class Asignatura {

    private String nombre, curso;
    private int codigo;

    public Asignatura(String nom, String curs, int cod) {//CONSTRUCTOR
        nombre = nom;
        curso = curs;
        codigo = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCurso() {
        return curso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void imprimeAsignatura() {
        System.out.println("************************");
        System.out.println("Nombre: " + nombre);
        System.out.println("Curso: " + curso);
        System.out.println("Código: " + codigo);
        System.out.println("************************\n");
    }
}
