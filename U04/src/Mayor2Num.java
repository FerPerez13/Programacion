package Practica4;

// Ejercicio 3. Fernando Pérez Andrés

import java.util.Scanner;

public class Mayor2Num {
    
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);
        int num1, num2;
        System.out.println("Dame el primer número: ");
        num1=tcl.nextInt();
        System.out.println("Dame el segundo número: ");
        num2=tcl.nextInt();
        System.out.println("El mayor de los dos números es: "+mayor(num1,num2));
    }
    
    public static int mayor(int n1, int n2){
        int may=n1;
        if(may<n2){
            may=n2;
        }
        return may;
    }
}
