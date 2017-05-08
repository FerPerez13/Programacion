// Ejercicio 3: Fernando Pérez Andrés

package Examen;

import java.util.*;

public class CporAsterisco {
    public static void main (String args[]){
        Scanner tcl = new Scanner(System.in);
        
        System.out.println("Dime un único caracter que quieras reemplazar: ");
        String cs = tcl.next();
        if(cs.length()>1){
            System.out.println("Te pedí un único caracter, asi que me voy a quedar solo con la primera letra.");
        }
        char c= cs.charAt(0); // convertimos cs en un único carácter char que será la primera letra
                
        System.out.println("Ahora dime un texto:");
        String cad = tcl.next();
        
        // Reemplazamos todos los elementos que queremos del string por *

        String cad1="";
        for(int i=0; i<cad.length(); i++){ //Recorremos todo el String
             if(cad.charAt(i) == c){  
                 cad1 = cad1+'*'; // unimos en el nuevo string los elementos char uno a uno dependiendo si cumplen la condición o no
             }else{
                 cad1 = cad1 + cad.charAt(i);
             }
         }
         System.out.println(cad1);

    }
    
}
