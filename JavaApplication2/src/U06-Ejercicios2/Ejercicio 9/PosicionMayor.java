//Ejercicio 9. Fernando Pérez Andrés
package U06Ejercicios2;

import java.util.*;

public class PosicionMayor {
    public static void main(String args[]){
        Random rnd = new Random();
        int[] vec =new int[20];
        for(int i=0; i<vec.length;i++){
            vec[i] = rnd.nextInt(20);
        }
        System.out.println(Arrays.toString(vec));
        
        int M=-1;
        int posM=-1;
        for(int i=0; i<vec.length; i++){
            if(vec[i]>M){
                M=vec[i];
                posM=i;
            }
        }
        System.out.println("El valor mas grande es "+M+" y su posición es "+posM);
    }
    
}
