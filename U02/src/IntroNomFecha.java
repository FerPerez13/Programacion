// Ejercicio 2. Fernando Pérez Andrés

import java.util.Scanner;

public class IntroNomFecha {
    public static void main(String args[]){
                Scanner tcl = new Scanner(System.in);
                String nombre, apellido1, apellido2, mes;
                int dia, año;
                System.out.println("Dime tu nombre: ");
                nombre=tcl.next();                       
                System.out.println("Ahora dame tu primer apellido: ");
                apellido1=tcl.next();
                System.out.println("Y para terminar dame tu segundo apellido");
                apellido2=tcl.next();
                System.out.println("¿Que dia naciste?");
                dia=tcl.nextInt();
                System.out.println("¿En que mes?");
                mes=tcl.next();
                System.out.println("¿Y en que año?");
                año=tcl.nextInt();
                System.out.println("Encantado de conocerte " + nombre + " " + apellido1 + " "  + apellido2);
                System.out.println("Naciste el " + dia + "/" + mes + "/" + año);
    }
    
}
