// Ejercicio 1. Fernando Pérez Andrés

package Ejercicios2;

import java.util.*;

public class LanzaExcepcion {
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);
        boolean esbien = false;
        int num=0;
        do{
            try{
                System.out.println("Tienes que darme un número entero");
                num = tcl.nextInt();
                esbien = true; 
            }catch (InputMismatchException e){
                System.out.println("ERROR: Necesito un número entero.");
                tcl.nextLine();
            }
        }while(!esbien);
        System.out.println("Así que me has dado el valor: "+num);
     }
}
