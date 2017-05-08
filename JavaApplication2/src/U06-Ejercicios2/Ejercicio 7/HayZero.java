//Ejercicio 7. Fernando Pérez Andres
package U06Ejercicios2;

import java.util.*;

public class HayZero {
    public static void main(String args[]){
        Random rnd = new Random();
        int[] vec =new int[50];
        for(int i=0; i<vec.length;i++){
            vec[i] = rnd.nextInt(50);
        }
        System.out.println(Arrays.toString(vec));
        int cont=0;
        for(int i=0; i<vec.length; i++){
            if(vec[i]==0){
                System.out.println("Elemento: "+vec[i]+" Posición: "+i);
                cont++;
                break;
            }
        }
        if(cont==0){
            System.out.println("No hay elementos 0 en el vector.");
        }
    }
}
