package Ejercicios1;

//Ejercicio 7. Fernando Pérez Andr

import java.util.*;
import java.util.Scanner;

public class CuotaClub {
    public static void main (String args[]){
        Scanner tcl = new Scanner(System.in);
        double cuota=500;
        int edad; 
        boolean PadreSocio;
        boolean correct=false;
        do{
            try{
                System.out.println("Cuantos años tiene el socio: ");
                edad=tcl.nextInt();
                correct=true;
                if(edad>65){
                    cuota=cuota-cuota/2;
                    System.out.println("Tiene que pagar "+cuota+"€ por ser mayor de 65 años.");
                }else if(edad<18){
                    correct=false;
                    System.out.println("El abonado es menor de edad. ¿Los padres son socios? (true/false)");
                    PadreSocio=tcl.nextBoolean();
                    correct=true;
                    if(PadreSocio==true){
                        cuota=cuota-cuota*0.35;
                        System.out.println("Tiene que pagar "+cuota+"€ por tener un padre socio.");
                    }else{
                        cuota=cuota-cuota*0.25;
                        System.out.println("Tiene que pagar "+cuota+"€ por no tener un padre socio.");
                    }
                }else{
                    System.out.println("Tiene que pagar 500€ de cuota.");
                }
            }catch(InputMismatchException e1){
                System.out.println("ERROR: No es valido");
                tcl.nextLine();
            }
        }while(!correct);
       
    }
}