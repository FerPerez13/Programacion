//Ejercicio 2 apartado B
package Ejercicios2;


public class Excepciones02b {
    
    public static int devuelveEntero(int num){
        if(num%2==0){
            return 1;
        }else{
            return 2;
        }
        
    }

    public static void main(String[] args){
        for(int i=0;i<10;i++){
            System.out.println(devuelveEntero(i));
        }
    }
}
