// Ejercicio 4. Fernando Pérez Andrés

package Ejercicios2;

import java.util.*;

public class ClaseExcep1 {
    
    public static void dividirEntreArray(int num, int[] array){
        int div = 0;
        for (int i=0; i<array.length; i++){
            div = num / array[i];
            System.out.println(num +":"+ array[i]+"="+div);
        }
    }
    
    public static void main (String[] args){
        int num = 2;
        int[] array = {-2,-1,0,1,2};
        dividirEntreArray(num, array);
    }
}
