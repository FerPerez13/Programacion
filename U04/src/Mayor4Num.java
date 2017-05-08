package Practica4;

// Ejercicio 5. Fernando Pérez Andrés

import java.util.Scanner;

public class Mayor4Num {
    
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);
        int num1, num2, num3, num4;
        System.out.println("Dame el primer número: ");
        num1=tcl.nextInt();
        System.out.println("Dame el segundo número: ");
        num2=tcl.nextInt();
        System.out.println("Dame el tercer número: ");
        num3=tcl.nextInt();
        System.out.println("Dame el cuarto número: ");
        num4=tcl.nextInt();
        System.out.println("El mayor de los cuatro números es: "+mayor(num1,num2,num3,num4));
    }

    public static int mayor(int n1, int n2, int n3, int n4) {
        int may=n1;
        if(may<n2){
            may=n2;
        }
        if(may<n3){
            may=n3;
        }
        if(may<n4){
            may=n4;
        }
        return may;
    }
    
    
    
}
