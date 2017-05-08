//Ejercicio 9b. Fernando Pérez Andrés

import java.util.*;

public class FacPrimo {
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);
        int num;
        int div=2;
        System.out.println("Dame el número entero que quieres factorizar:");
        num=tcl.nextInt();
        
        System.out.print(num+" = ");
        if(num>1){
            for(int i=0; i<=num;i++){
                if(num%div==0){
                    System.out.print(div+" * ");
                    num=num/div;
                }else{div++;}
            }
        }else{
            System.out.println("ERROR: el número es negativo.");
        }
        System.out.println(1);
    }
}
