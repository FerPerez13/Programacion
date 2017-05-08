//Ejercicio 14. Fernando Pérez Andres

package U06Ejercicios2;

import java.util.*;

public class VPar {
    public static void main(String args[]){
        Random rnd = new Random();
        int[] V =new int[50];
        int cont=0;
        for(int i=0; i<V.length;i++){
            V[i] = rnd.nextInt(50);
            if(V[i]%2==0){
                cont++;
            }
        }
        System.out.println("V="+Arrays.toString(V));
        
        int[] P = new int[cont];
        int j=0;
        for(int i=0;i<V.length;i++){
            if(V[i]%2==0){
                P[j]=V[i];
                j++;
            }
        }
        if(j!=0){
            System.out.println("P="+Arrays.toString(P));
        }else{
            System.out.println("No hay elementos pares en V");
        }
    }
    
}
