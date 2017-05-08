
package Ejercicios2;

import java.io.*;
import java.util.*;

public class Agenda{
    public static void main (String args[]){
        Scanner tcl = new Scanner(System.in);
        
        try{
           FileOutputStream file = new FileOutputStream("agenda.dat",true);
           BufferedOutputStream buff = new BufferedOutputStream(file);
           DataOutputStream dat = new DataOutputStream(buff);
           
           
           String nombre;
           String dir;
           long tlf;
           String email;
           
           //Pedir al usuario la información 
           
           System.out.println("Nombre:");
           nombre  = tcl.nextLine();
           
           System.out.println("Dirección");
           dir = tcl.nextLine();
           
           System.out.println("Teléfono:");
           tlf = tcl.nextLong();
           tcl.nextLine();
           
           System.out.println("E-Mail");
           email = tcl.nextLine();
           
           
           dat.writeUTF(nombre);
           dat.writeUTF(dir);
           dat.writeLong(tlf);
           dat.writeUTF(email);
           
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
