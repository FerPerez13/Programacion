package Practica4;

// Ejercicio 1. Fernando Pérez Andrés

import java.util.Scanner;

public class SumaInt {
    
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);
        int num1;
        System.out.println("Dime el primer número:");
        num1=tcl.nextInt();
        int num2;
        System.out.println("Dime el segundo número:");
        num2=tcl.nextInt();
        System.out.println("La suma de ambos es: "+suma(num1,num2));
    }
    
    public static int suma(int num1, int num2){
        int sum;
        sum=num1+num2;        
        return sum;
    } 
}
