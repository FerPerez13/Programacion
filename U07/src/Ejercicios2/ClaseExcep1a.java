// Ejercicio 4 subapartado a. Fernando Pérez Andrés

package Ejercicios2;

import java.io.IOException;
import java.util.*;

public class ClaseExcep1a {
    
    public static void dividirEntreArray(int num, int[] array){
        int div = 0;
        
            for (int i=0; i<array.length; i++){
                try{
                    div = num / array[i];
                    System.out.println(num +":"+ array[i]+"="+div);
                }catch (ArithmeticException e){
                    System.out.println("Divido por 0");
                }
            }
    }
    
    public static void main (String[] args){
        int num = 2;
        int[] array = {-2,-1,0,1,2};
            dividirEntreArray(num, array);
        
    }
}
