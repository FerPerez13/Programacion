// Ejercicio 2. Fernando Perez Andres

import java.util.*;

public class Mayor25 {
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);
        int edad;
        System.out.println("Hola, ¿Cuantos años tienes?: ");
        edad=tcl.nextInt();
        
        if (edad<25){
            System.out.println("Lo siento, no tienes más de 25 años.");
        }else if (edad>25){
            System.out.println("Tienes más de 25 años.");
        }else{
            System.out.println("Tienes exactamente 25 años.");
        }
    }
}    

