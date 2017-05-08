// Escribir fichero cadena a cadena

package Ficheros;

import java.io.*;

public class EscribirFicheroCadena {
    public static void main (String args[]){
        String nombreFichero = "nuevo.txt";
        String texto = "Hola me llamo Fernando";
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter(nombreFichero, true));
            bw.newLine();
            bw.write(texto);
            bw.newLine();          
        }catch (Exception e){
            System.out.println("Error de escritura en el fichero");
            System.out.println(e.getMessage());
        }finally{
            try{
                if(bw != null){
                    bw.close();
                }
            }catch (Exception e){
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
    } 
}
