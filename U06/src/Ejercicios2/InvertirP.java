// Ejercicio 12. Fernando Pérez Andres

package U06Ejercicios2;

import java.util.*;

public class InvertirP {
    public static void main(String args[]){
        Random rnd = new Random();
        int[] P =new int[10];
        for(int i=0; i<P.length;i++){
            P[i] = rnd.nextInt(20);
        }
        System.out.println("P="+Arrays.toString(P));

        int[] V = new int[10];
        V=P.clone();
        Arrays.sort(V);
        System.out.println("V="+Arrays.toString(V));  
    }
}
