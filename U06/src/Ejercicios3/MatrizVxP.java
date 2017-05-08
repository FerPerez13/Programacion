// Ejercicio 3. Fernando Pérez Andres

package U06Ejercicios3;

import java.util.*;

public class MatrizVxP {
    public static void main(String args[]){
        Random rnd=new Random();
        int[] V= new int[50];
        int[] P=new int[20];
        int[][] M = new int[50][20];
        
        for(int i=0; i<V.length;i++){ // Creamos V
            V[i]=rnd.nextInt(10);   
        }
        System.out.println("V="+Arrays.toString(V));
        for(int j=0; j<P.length;j++){ // Creamos P
                P[j]=rnd.nextInt(10);
        }
        System.out.println("P="+Arrays.toString(P));
        
        System.out.println("M=");
        for(int i=0; i<V.length;i++){
            for(int j=0; j<P.length;j++){
                M[i][j]=V[i]*P[j];
            }
            System.out.println(Arrays.toString(M[i]));
        }
       
    }
}
