//Ejercicio 3. Fernando Pérez Andrés

import java.util.*;

public class ParImpar {
    public static void main (String args[]){
        Scanner tcl = new Scanner(System.in);
        int num; 
        System.out.println("Dame un número entero: ");
        num=tcl.nextInt();
        
        if (num%2==0){
            System.out.println("El número introducido es par.");
        } else {
            System.out.println("El número introducido es impar.");
        }
    }
}
