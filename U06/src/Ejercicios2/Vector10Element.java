//Ejercicio 2. Fernando Pérez Andres
package U06Ejercicios2;

import java.util.*;

public class Vector10Element {

    
    public static void main(String args[]){
        int[] vect = ImprimeVector();
        System.out.println(Arrays.toString(vect));
        
        System.out.println(Arrays.toString(PrintVecPar(vect)));
    
        System.out.println(Arrays.toString(PrintVecImpar(vect)));
    }
    
    public static int[] ImprimeVector(){
        //Ejercicio 1
        Scanner tcl = new Scanner(System.in);
        int[] vec = new int[10];
        for(int i=0;i<vec.length;i++){
            System.out.println("Dime el "+(i+1)+"r número del Array:");
            vec[i] = tcl.nextInt();      
        }
        return vec;
    }
    
    public static int[] PrintVecPar(int[] vec){
        //Ejercicio 2.1
        int[] vecPar = new int[5];
        int iPar=0;
        for (int i=0; i<vec.length; i++){
            if(i%2==0){
                vecPar[iPar] = vec[i];
                iPar++;
            }
        }
       return vecPar;
    }
    
    public static int[] PrintVecImpar(int[] vec){
        //Ejercicio 2.2
        int[] vecPar = new int[5];
        int iPar=0;
        for (int i=0; i<vec.length; i++){
            if(i%2!=0){
                vecPar[iPar] = vec[i];
                iPar++;
            }
        }
       return vecPar;
    }
    
    
    
}
