// Parte2 Ejercicio 1. Fernando Pérez Andrés

package Practica5;

import java.util.Scanner;

public class ExeCoche {
    
    public static void main(String args[]){
        Coche coche=new Coche();
        Scanner tcl=new Scanner(System.in);
        System.out.println("**********************************");
        System.out.println("* Programa de registro de coches *");
        System.out.println("**********************************");
        System.out.println("");
       
        System.out.println("Dime el modelo del coche:");
        String modelo=tcl.nextLine();
        tcl.nextLine();
        System.out.println("Dime el color:");
        String color=tcl.nextLine();
        
        System.out.println("¿La pintura es metalizada?(true/false):");
        boolean metalizada=tcl.nextBoolean();
        tcl.nextLine();
        System.out.println("Dime la matricula:");
        String matricula=tcl.nextLine();
        
        System.out.println("Dime el tipo de coche (MINI, UTILITARIO, FAMILIAR o DEPORTIVO):");
        String tipo=tcl.nextLine();
        
        System.out.println("Dime el año de fabricación:");
        int año=tcl.nextInt();
        
        System.out.println("Dime que tipo de seguro tiene:");
        String seguro=tcl.nextLine();
        
        tcl.nextLine();
        
        coche.setCoche(modelo,color,metalizada,matricula,tipo,año,seguro);
        
        coche.imprimeCoche(coche.getModelo(),coche.getColor());
    }
}
