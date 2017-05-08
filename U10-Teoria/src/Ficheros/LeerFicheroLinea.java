// Leer fichero Linea a Linea
package Ficheros;


import java.io.*;


public class LeerFicheroLinea {
    public static void main(String args[]){
        String nombreFichero = "nuevo.txt";
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(nombreFichero));
            String texto = br.readLine();
            while (texto != null){
                System.out.println(texto);
                texto = br.readLine();
            }
        }catch (FileNotFoundException e){
            System.out.println("ERROR: Fichero no encontrado");
            System.out.println(e.getMessage());
        }catch ( Exception e){
            System.out.println("ERROR: Error en la lectura del fichero");
            System.out.println(e.getMessage());
        }finally{
            try{
                if(br != null){
                    br.close();
                }
            }catch (Exception e){
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
    }
}
