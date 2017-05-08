// Ejercicio 6. Fernando Pérez Andrés

package Ejercicios2;

import java.util.*;

public class Fmail{
    //Creamos una clase privada para crear nuevas excepciones
    private static class DirCorreoIncorrectaExcepcion extends Exception{
        public DirCorreoIncorrectaExcepcion(){}
        public DirCorreoIncorrectaExcepcion(String correo){
            System.out.println("ERROR: "+ correo +" no es válido");
        }
    }
    
    public static void enviarMensaje(String correo){
        try{
            if(correo.contains("@") && correo.contains(".")){
                System.out.println("Correcto");
            }else{
                throw new DirCorreoIncorrectaExcepcion(correo);
            }
        }catch(DirCorreoIncorrectaExcepcion e){
            e.getMessage();
        }
    }
    
    public static void main(String[] args){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Dime tu correo:");
        String correo = tcl.nextLine();
        enviarMensaje(correo);
    }
}
