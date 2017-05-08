//Ejercicio 8b. Fernando Pérez Andrés

import java.util.*;

public class EsPrimo {
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);
        int num; 
        System.out.println("Dime un número entero porfavor:");
        num=tcl.nextInt();
        int cont=0;
        for(int i=num-1; i>1; i--){
            if(num%i==0){
                cont++;
            }
        }
        if(cont==0){
            System.out.println("Es primo.");
        }else{
            System.out.println("No es primo.");
        }  
    }
}
