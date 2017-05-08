
package Ejercicios2;

import java.io.*;

public class LeerAgenda {
    public static void main(String[] args){
        
        try{
           FileInputStream file = new FileInputStream("agenda.dat");
           BufferedInputStream buff = new BufferedInputStream(file);
           DataInputStream dat = new DataInputStream(buff);
           
           System.out.println(dat.readUTF());
           System.out.println(dat.readUTF());
           System.out.println(dat.readLong());
           System.out.println(dat.readUTF());
           
           dat.close();
           file.close();
           buff.close();
           
           dat.close();
           file.close();
           buff.close();
           
        } catch (FileNotFoundException e) {
           System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de lectura de fichero");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error general de fichero");
            System.out.println(e.getMessage());
       }
    }
}