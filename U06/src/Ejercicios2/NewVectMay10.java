//Ejercicio 11. Fernando Pérez Andrés

package U06Ejercicios2;

import java.util.*;

public class NewVectMay10 {
    public static void main(String args[]){
        Random rnd = new Random();
        int[] P =new int[10];
        int cont=0;
        for(int i=0; i<P.length;i++){
            P[i] = rnd.nextInt(20);
            if(P[i]>10){
                cont++;
            }
        }
        System.out.println("P="+Arrays.toString(P));
        int[] V = new int[cont];
        int j=0;
        for(int i=0;i<P.length;i++){
            if(P[i]>10){
                V[j]=P[i];
                j++;
            }
        }
        System.out.println("V="+Arrays.toString(V));
    }      
}

