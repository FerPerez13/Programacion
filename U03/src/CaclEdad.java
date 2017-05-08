// Ejercicio 8. Fernando Perez Andres

import java.util.*;

public class CaclEdad {
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);
        int diaA, mesA,añoA,diaN, mesN, añoN;
        System.out.println("¿Que dia es hoy?");
        diaA=tcl.nextInt();
        System.out.println("¿Que mes es actualente?");
        mesA=tcl.nextInt();
        System.out.println("¿En que año estamos?");
        añoA=tcl.nextInt();
        
        System.out.println("¿Que dia naciste?");
        diaN=tcl.nextInt();
        System.out.println("¿De que mes?");
        mesN=tcl.nextInt();
        System.out.println("¿En que año?");
        añoN=tcl.nextInt();
        
        int edad=0;
        if(añoN < añoA){
            edad=añoA-añoN;
        } else {
            System.out.println("ERROR: Has intruducido un año de nacimiento posterior al actual");
        }
        if(mesA<mesN){
            edad--;
        }else if(mesA==mesN){
            if(diaA<diaN){
                edad--;
            }
        }
        System.out.println("Tienes "+edad+" años.");
    }
}