// Ejercicio 8. Fernando Pérez Andres

package U06Ejercicios2;

import java.util.*;

public class MayoresDiez {
    public static void main(String args[]){
        Random rnd = new Random();
        int[] vec =new int[20];
        for(int i=0; i<vec.length;i++){
            vec[i] = rnd.nextInt(20);
        }
        System.out.println(Arrays.toString(vec));
        int cont=0;
        for(int i=0; i<vec.length; i++){
            if(vec[i]>10){
                System.out.println("Elemento:"+vec[i]+" Posición:"+i);
                cont++;
            }
        }
        System.out.println("Han habido "+cont+" elementos mayores de 10");
    }
    
}
