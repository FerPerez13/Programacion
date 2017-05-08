// Ejercicio 4 subapartado b. Fernando Pérez Andrés

package Ejercicios2;

import java.io.IOException;
import java.util.*;

public class ClaseExcep1b {
    
    public static void dividirEntreArray(int num, int[] array){
        int div = 0;
        
            for (int i=0; i<array.length; i++){
                if(array[i]==0){
                    System.out.println("Divido por 0");
                }else{
                    div = num / array[i];
                    System.out.println(num +":"+ array[i]+"="+div);
                }
            }
    }
    
    public static void main (String[] args){
        int num = 2;
        int[] array = {-2,-1,0,1,2};
            dividirEntreArray(num, array);
        
    }
}
