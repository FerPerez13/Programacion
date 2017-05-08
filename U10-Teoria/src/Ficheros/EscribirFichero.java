// Escribir Fichero Caracter a Caracter
package Ficheros;

import java.util.*;
import java.io.FileWriter;

public class EscribirFichero {
    
    public static void main(String args[]){
        
        Scanner tcl = new Scanner(System.in);
        String nombreFichero = "nuevo.txt";
        
        FileWriter fw = null;
        
        try{
            fw = new FileWriter(nombreFichero);
            
            System.out.println("¿Como quieres titular el archivo?:");
            String str = tcl.nextLine();
            str = str+"\n";
            
            fw.write(str); //Escribimos la linea introducida en el programa
            
            for (char c = 'A'; c <= 'Z'; c++){
                fw.write(c); // Escribimos los caracteres del abecedario en el fichero
            }
        }catch (Exception e){
            System.out.println("Error de escritura en el fichero");
            System.out.println(e.getMessage());
        }finally{
            try{
                if(fw!= null){
                    fw.close();
                }
            }catch (Exception e){
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.toString());
            }
        }
    }
    
}
