// Ejercicio 1. Fernando Pérez Andrés

package U06Ejercicios1;

import java.util.*;

public class Cadenas {
    public static void main(String args[]){
        Scanner tcl=new Scanner(System.in);
        
        System.out.println("Dime el nombre: ");
        String nom=tcl.next();
        System.out.println("Dime el primer apellido: ");
        String ap1=tcl.next();
        System.out.println("Dime el sgundo apellido: ");
        String ap2=tcl.next();
        
        String nomcom=nom+ap1+ap2;
        
        System.out.println("-1--mayuscula--");
        
        System.out.println(nomcom.toLowerCase());
        System.out.println(nomcom.toUpperCase());
        System.out.println(nomcom.length());
        
        System.out.println("-2--minusc---");
        
        if(nomcom.length()>1){
            String carac=nomcom.substring(0, 2);
            System.out.println(carac);
        }
        
        System.out.println("-3--Nºcarac---");
        
        if(nomcom.length()>1){
            String carac=nomcom.substring(nomcom.length()-2, nomcom.length());
            System.out.println(carac);
        }
        
        System.out.println("-4-Repite ult--");
        
        String ca=nomcom.substring(nomcom.length()-1);
        
        int cont=0;
        char cara = nomcom.charAt(nomcom.length()-1);
        for(int i =0; i<nomcom.length()-1; i++){
            if(nomcom.charAt(i)==cara){
                cont++;
            }
        }
        System.out.println("El caracter "+cara+" se repite "+cont+" veces");
        
        System.out.println("-5--Repite Mayusc--");
        
        char primer=nomcom.charAt(0);
        char primerM=Character.toUpperCase(primer);
        System.out.println(nomcom.replace(primer, primerM));
        
        System.out.println("-6--Asteriscos--");
        
        System.out.println("*** "+nomcom+" ***");
        
        System.out.println("-7--Invertida--");
        
        for(int i=nomcom.length()-1; i>-1; i--){
            System.out.print(nomcom.charAt(i));
        }        
        System.out.println(".");   
    }
}
