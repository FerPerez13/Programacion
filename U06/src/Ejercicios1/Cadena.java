//Ejercicios 2,3,4,5. Fernando Pérez Andrés    

package U06Ejercicios1;

import java.util.*;

public class Cadena {
    
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);
        
        System.out.println("***Ejercicio 2***");
        System.out.println("Dime algo: ");
        String dicho=tcl.next();
        System.out.println(minuscToA(dicho));
        System.out.println("");
        
        System.out.println("***Ejercicio 3***");
        System.out.println("Dime algo: ");
        dicho=tcl.next();
        System.out.println(mitadInicial(dicho));
        System.out.println("");
        
        System.out.println("***Ejercicio 4.1***");
        System.out.println("Dime algo: ");
        dicho=tcl.next();
        System.out.println(esXnopor(dicho));
        System.out.println("");
        
        System.out.println("***Ejercicio 4.2***");
        System.out.println("Dime algo: ");
        dicho=tcl.next();
        System.out.println(numXasterisco(dicho));
        System.out.println("");
        
        System.out.println("***Ejercicio 5***");
        System.out.println("¿Dime algo?: ");
        dicho=tcl.next();
        System.out.println("¿Dime que busco en esa cadena?: ");
        String dicho2=tcl.next();
        System.out.println("Se repite "+contCadena(dicho,dicho2)+" veces.");
        System.out.println("");       
        
    }

    public static String minuscToA(String cad1){
        // Ejercicio 2
        for(int i=0; i<cad1.length(); i++){
            if(cad1.charAt(i)=='a' | cad1.charAt(i)== 'e'| cad1.charAt(i)== 'i'| cad1.charAt(i)== 'o'| cad1.charAt(i)== 'u'){
                cad1=cad1.replace(cad1.charAt(i),'a');
            }
        }
        return cad1;
    }
    
    public static String mitadInicial(String cad){
        // Ejercicio 3
        int j= cad.length() / 2;
        String cadM="";
        for (int i=0; i<j; i++){
            cadM=cadM+cad.charAt(i);
        }
       return cadM;
    }
    
    public static String esXnopor(String cad){
        // Ejercicio 4.1
        String es="es";
        String nopor="no por";
        cad=cad.replaceAll(es, nopor);
        return cad;
    }
    
    public static String numXasterisco(String cad){
        // Ejercicio 4.2
        cad=cad.replaceAll("\\d+", "*");
        return cad; 
    }
    
    public static int contCadena(String original,String busqueda){
       // Ejercicio 5 
        int cont=0;
        int j = original.length();
        for(int i=0; i<j;i++){ 
            int prim=original.indexOf(busqueda);
            if (prim != -1){
                cont++;
                original = original.substring(prim+1);
            }
        }
        return cont;
    }
}
