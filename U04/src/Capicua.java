package Practica4;

// Ejercicio 11. Fernando Pérez Andrés

import java.util.Scanner;

public class Capicua {
    public static void main(String args[]){
        Scanner tcl=new Scanner(System.in);
        int n1,n2,n3,n4;
        System.out.println("Dame la primera cifra:");
        n1=tcl.nextInt();
        System.out.println("Dame la segunda cifra:");
        n2=tcl.nextInt();
        System.out.println("Dame la tercera cifra:");
        n3=tcl.nextInt();
        System.out.println("Dame la cuarta cifra:");
        n4=tcl.nextInt();
        
        if(Capicua.capicua(n1,n2,n3,n4)==true){
            System.out.println("El número "+n1+n2+n3+n4+" SI es capicua");
        }else{
            System.out.println("El número "+n1+n2+n3+n4+" NO es capicua");
        }
    }
    public static boolean capicua(int n1,int n2,int n3,int n4){
        if(n1==n4 && n2==n3){
            return true;
        }else{
            return false;
        }
    }
}
