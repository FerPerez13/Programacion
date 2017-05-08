// Leer fichero caracter a caracter
package Ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerFichero {
    public static void main(String args[]) throws FileNotFoundException, IOException{
        String nombrefichero = "nuevo.txt";

        FileReader fr = null;

        try {
            fr = new FileReader(nombrefichero);
            int caract = fr.read();
            while (caract != -1) {
                System.out.print((char) caract);
                caract = fr.read();
            }
            System.out.print("\n");
        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());  
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
    }
}
