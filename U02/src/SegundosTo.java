// Ejercicio 17. Fernando Pérez Andrés

import java.util.Scanner;

public class SegundosTo {
    public static void main (String args[]){
        Scanner tcl = new Scanner(System.in);
        double segundos,minutos,horas,dias;
        System.out.println("¿Cuantos segundos quieres que te convierta?");
        segundos=tcl.nextDouble();
        
        // Pasamos segundos a demas
        minutos=segundos/60;
        System.out.println("Serán: "+minutos+ " minutos");
        horas=minutos/60;
        System.out.println("Serán: "+horas+ " horas");    
        dias=horas/24;
        System.out.println("Serán: "+dias+ " dias");
    }
}
