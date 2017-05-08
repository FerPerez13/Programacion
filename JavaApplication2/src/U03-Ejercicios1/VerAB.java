//Ejercicio 4b. Fernando Pérez Andrés

import java.util.*;

public class VerAB {
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);    
        int A;
        System.out.println("Dime un número: ");
        A=tcl.nextInt();
        int B;
        System.out.println("Ahora dime un número más grande: ");
        B=tcl.nextInt();
        
        if(B>A){
            System.out.println("Los números comprendidos entre ambos son: ");
            int cont=0;
            for(int i=A;i<B+1; i++){
                System.out.println(i);
                if(i%2==0){
                    cont++;
                }
            }
            System.out.println("He encontrado "+cont+" números pares entre el "+A+" y el "+B+".");
        }else{
            System.out.println("ERROR: El segundo número es más pequeño o igual que el primero.");
        }
        
    }
}