package Practica4;

// Ejercicio 10. Fernando Pérez Andrés 

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        Scanner tcl=new Scanner(System.in);
        int num; 
        System.out.println("¿Que número quieres que te calcule el factorial?");
        num=tcl.nextInt();
        System.out.println("RESULTADO: "+num+"! = "+fact(num));
    }
    public static int fact(int num){
        int res=1;
        for(int i=num;i>0;i--){
            res=res*i;
        }
        return res;
    }
}
