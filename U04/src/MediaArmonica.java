package Practica4;

//Ejercicio 9. Fernando Pérez Andrés

import java.util.Scanner;

public class MediaArmonica {
    public static void main(String args[]){
        Scanner tcl=new Scanner(System.in);
        double num1,num2;
        System.out.println("Dime el primer número:");
        num1=tcl.nextDouble();
        System.out.println("Dime el segundo número:");
        num2=tcl.nextDouble();
        
        System.out.println("El resultado de hacer la média armonica es: "+Medarm(num1,num2));
    }
    public static double Medarm(double n1, double n2){
        double media=0;
        double inv1=1/n1;
        double inv2=1/n2;
        
        media=(inv1+inv2)/2;
        media=1/media;
        return media;
    }
}
