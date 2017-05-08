package Practica4;

// Ejercicio 13. Fernando Pérez Andrés

import java.util.Scanner;

public class NumPerfecto {
    public static void main(String args[]){
        Scanner tcl=new Scanner(System.in);
        int num;
        System.out.println("Dame un número y te diré si es perfecto o no:");
        num=tcl.nextInt();
        
        if(NumPerfecto.EsPerfecto(num)==true){
            System.out.println("El número "+num+" SI es perfecto");
        }else{
            System.out.println("El número "+num+" NO es perfecto");
        }
    }
    
    public static boolean EsPerfecto(int num){
        int sumadiv=0;
        if(num==1){         // El caso de num=1 es peculiar,
            return true;    // por eso lo ponemos a parte
        }
        for(int i=num-1;i>0;i--){
            if(num%i==0){           //
                sumadiv=sumadiv+i;  //Es divisor
            }                       //
        }
        if(sumadiv==num){
            return true;
        }else{
            return false;
        }
    }
}
