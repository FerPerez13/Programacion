//Ejercicio 4. Fernando Pérez Andres

package U06Ejercicios2;

import java.util.*;

public class VerPares {
    public static void main(String args[]){
        Random rnd=new Random();
        int[] vec = new int[10];
        for(int i=0; i<10; i++){
            vec[i]=rnd.nextInt(10);
        }
        
        System.out.println(Arrays.toString(vec));
        
        for(int i=0; i<10; i++){
            if(vec[i]%2==0){
                System.out.println("Elemento:"+vec[i]+" Posición:"+i+" PAR");
            }else{
                System.out.println("Elemento:"+vec[i]+" Posición "+i+" IMPAR");
            }
        }
    }
    
}
