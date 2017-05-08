// 2ªParte. Ejercicio 2. Fernando Pérez Andrés

package Practica5;

import java.util.Scanner;

public class ExeCarrera {
    public static void main(String args[]){
        Scanner tcl=new Scanner(System.in);
        System.out.println("**********************************");
        System.out.println("**** Programa de la facultad *****");
        System.out.println("**********************************");
        System.out.println("");
        
        Carrera carrera=new Carrera();
        
        System.out.println("Nombre de la Asigantura:");
        String nom=tcl.nextLine();
        carrera.setNombre(nom);
        System.out.println("¿Que codigo quieres ponerle?");
        int cod = tcl.nextInt(); //Después de los NextInt normalmente se queda un residuo que lo almacena un posible valor proximo
        tcl.nextLine();          //Por eso ponemos este nextLine para evitar que guarde sin sentido alguno. 
        carrera.setCodigo(cod);
        System.out.println("Que curso se va a cursar:");
        String curs=tcl.nextLine();
        carrera.setCurso(curs);

        
        carrera.imprimeAsignatura(carrera.getNombre(),carrera.getCodigo(), carrera.getCurso());
    }
    
}
