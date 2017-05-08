//Ejercicio 3. Fernando Perez Andres

import java.util.Scanner;

public class NotasProgramación {
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Notas Programación 2015");
        double notaA1;
        System.out.println("¿Cual es la nota del primer parcial?: ");
        notaA1=tcl.nextDouble();
        double notaA2;
        System.out.println("¿Cual es la nota del segundo parcial?: ");
        notaA2=tcl.nextDouble();
        double mediaA;
        mediaA=(notaA1+notaA2)/2;
        System.out.println("La nota media de A es: " + mediaA);
    }
}
