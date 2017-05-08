//Ejercicio 3. Fernando Pérez Andrés
package U06Ejercicios2;

import java.util.*;

public class De4en4 {
    public static void main(String args[]){
        Random rnd=new Random();
        int[] vec = new int[20];
        for(int i=0; i<20; i++){
            vec[i]=rnd.nextInt(20);
        }
        
        int[] vecN= new int[4];
        int j=0;
        for(int i=0; i<20 ; i++){
            vecN[j]=vec[i];
            j++;
            if(j==4){
                j=0;
                System.out.println(Arrays.toString(vecN));
            }
        }
    }
    
    
}
