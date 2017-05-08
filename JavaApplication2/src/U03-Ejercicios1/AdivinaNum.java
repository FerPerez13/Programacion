//Ejercicio 11b. Fernando Pérez Andrés

import java.util.*;


public class AdivinaNum {
    public static void main(String args[]){
        Random rnd = new Random();
        Scanner tcl = new Scanner(System.in);
        int num;
        num = rnd.nextInt(100);
        num=num+1; //El random empieza en 0 hasta el 99 y nos interesa del 1 al 100. 
        int x=0; 
        int contador=0;
        System.out.println("He elegido un número del 1 al 100, a ver si lo adivinas.");
        
        while(x!=num){
            System.out.println("Que numero piensas que es: ");
            x=tcl.nextInt();
            if(x<num){
                System.out.println("INCORRECTO: El número es MAYOR...");
            }else if(x>num){
                System.out.println("INCORRECTO: El número es MENOR...");
            }
            contador++;
        }
        System.out.println("¡¡¡¡Felicidades!!!! Has escontrado el número en "+contador+" intentos. ¡Prueba suerte otra vez!");
    }
}
