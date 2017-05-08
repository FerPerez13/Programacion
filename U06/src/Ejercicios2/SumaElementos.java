//Ejercicio 13. Fernando Pérez Andrés
package U06Ejercicios2;

import java.util.*;

public class SumaElementos {
    public static void main(String args[]){
        Random rnd = new Random();
        int[] V =new int[50];
        for(int i=0; i<V.length;i++){
            V[i] = rnd.nextInt(50);
        }
        System.out.println("V="+Arrays.toString(V));
        
        int[] P =new int[50];
        for(int i=0; i<P.length;i++){
            int suma=0;
            for(int j=0; j<i+1 ;j++){
                suma=suma+V[j];
            }
            P[i]=suma;
        }
        System.out.println("P="+Arrays.toString(P));

    
        
    }
    
}
