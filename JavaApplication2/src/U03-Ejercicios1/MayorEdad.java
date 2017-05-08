// Ejercicio 1. Fernando Pérez Andrés 

import java.util.*;

public class MayorEdad {
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);
        int edad;
        System.out.println("Hola, ¿Cuantos años tienes?: ");
        edad=tcl.nextInt();
        
        if (edad<18){
            System.out.println("Lo siento, no eres mayor de edad.");
        }else{
            System.out.println("Eres mayor de edad.");
        }
    }
}
