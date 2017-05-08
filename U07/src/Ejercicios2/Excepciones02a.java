//Ejercicio 2 apartado A. Fernando Pérez Andrés
package Ejercicios2;

import java.util.*;

public class Excepciones02a {    
    public static int devuelveEntero(int num){
        try{
            if(num%2==0){
                throw new Exception("Lanzando excepción");
            }
            return 2;
        }catch(Exception e){
            return 1;
        }
    }
    
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            System.out.println(devuelveEntero(i));
        }
    }
}
