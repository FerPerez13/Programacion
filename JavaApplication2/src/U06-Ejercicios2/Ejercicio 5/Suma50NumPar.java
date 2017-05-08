//Ejercicio 5. Fernando Pérez Andrés

package U06Ejercicios2;

import java.util.*;

public class Suma50NumPar {
    public static void main(String args[]){
        Random rnd=new Random();
        int[] vec = new int[50];
        for(int i=0; i<50; i++){
            vec[i]=rnd.nextInt(100);
        }
        System.out.println(Arrays.toString(vec));
        int sum=0;
        for (int i=0; i<vec.length;i++){
            if(vec[i]%2==0){
                sum=sum+vec[i];
            }
        }
        System.out.println("La suma de los valores pares del vector dan: "+sum);
    }
}
