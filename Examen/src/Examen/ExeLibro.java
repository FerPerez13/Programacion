// Ejecutable del Ejercicio 4: Fernando Pérez Andrés

package Examen;

public class ExeLibro {
    public static void main(String args[]){
        Libro lib1=new Libro();
        Libro lib2=new Libro("Examen de Programación", "Fernando Pérez Andrés", 10, 0);
        
        lib1.escribir();
        System.out.println();
        
        lib2.escribir();
        System.out.println();
        
        System.out.println("Vamos a introducir datos al primer libro: ");
        System.out.println();
        lib1.setAutor("Maria Primo Leal");
        lib1.setTitulo("Periodismo Deportivo");
        lib1.setNumeroEjemplares(4);
        lib1.setNumeroPrestados(6);
        
        System.out.println("Vemos los cambios:");
        lib1.escribir();
        System.out.println();
        
        System.out.println("Vamos a realizar prestamos y devoluciones");
        System.out.println();
        
        System.out.println("Prestamo + Prestamo + Devolucion libro Periodismo");
        System.out.println();
        lib1.prestamo();
        lib1.prestamo();
        lib1.devolucion();
        System.out.println();

        System.out.println("Intento de Devolución Examen + Prestamo libro Examen");
        System.out.println();
        lib2.devolucion();
        lib2.prestamo();
        System.out.println();
        
        System.out.println("Despues de un un dia de prestamos y devoluciones los libros nos quedan de este modo:");
        System.out.println();
        lib1.escribir();
        System.out.println();
        lib2.escribir();
        System.out.println();       
    }
}
