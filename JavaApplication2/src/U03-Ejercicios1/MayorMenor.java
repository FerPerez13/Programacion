// Ejercicio 4. Fernando Perez Andres

import java.util.Scanner;

public class MayorMenor {
    public static void main (String args[]){
        Scanner tcl = new Scanner(System.in);
        int num1; // Aqui irá el número mas grande
        int num2; // Aqui irá el número mas pequeño
        int aux; // Variable Auxiliar necesaria para la ordenación
        System.out.println("Dame un número: ");
        num1=tcl.nextInt();
        System.out.println("Dame otro número: ");
        num2=tcl.nextInt();
        
        aux=num1;
        if (num2>aux){ //num2 es el mayor
            num1=num2;
            num2=aux;
            System.out.println("El orden de los números es: "+num1+", "+num2);
        }else{ //el num1 es el mayor
            System.out.println("El orden de los números es: "+num1+", "+num2);
        }        
    }
}
