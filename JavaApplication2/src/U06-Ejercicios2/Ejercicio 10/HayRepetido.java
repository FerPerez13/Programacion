// Ejercicio 10. Fernando Pérez Andrés

package U06Ejercicios2;

import java.util.*;

public class HayRepetido {
    public static void main(String args[]){
        Random rnd = new Random();
        int[] vec =new int[20];
        for(int i=0; i<vec.length;i++){
            vec[i] = rnd.nextInt(20);
        }
        System.out.println(Arrays.toString(vec));
        
        for(int i=0; i<vec.length; i++){
            for(int j=i;j<vec.length;j++){
                if(vec[i]==vec[j] && i!=j){
                    System.out.println("El valor "+vec[j]+" se repite en las posiciones:"+i+" y "+j);
                }
            }
        }       
    }    
}
