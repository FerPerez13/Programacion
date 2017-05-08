//Ejercicio 2. Fernando Pérez Andrés
package GestionPacientes;

import java.io.*;
import java.util.*;

public class GestionPacientes {
    
    public static int menu(){
        Scanner tcl = new Scanner(System.in);
        System.out.println("####### Hospital Serpis #######");
        System.out.println("");
        System.out.println("1. Lista de pacientes");
        System.out.println("2. Nuevo paciente");
        System.out.println("3. Salir");
        System.out.println("");
        System.out.println("###############################");
        int sel = tcl.nextInt();
        tcl.nextLine();
        return sel;
    }
    
    public static Archivador leerArchivador(){
        try{
            FileInputStream file = new FileInputStream("GestionPacientes.fpa");
            BufferedInputStream buf = new BufferedInputStream(file);
            ObjectInputStream ist = new ObjectInputStream(buf);

            Archivador a = new Archivador();

            a = (Archivador) ist.readObject();

            ist.close();
            
            return a;
            
            }catch(IOException e){
               System.err.println("El archivo todavía no existe");
               return null;
            }catch(ClassNotFoundException e){
               System.err.println("ERROR: Clase no encontrada");
               return null;
            }
    }
    
    public static void escribirArchivador(Archivador a){
        try{
            FileOutputStream fil = new FileOutputStream("GestionPacientes.fpa");
            BufferedOutputStream buff = new BufferedOutputStream(fil);
            ObjectOutputStream ost = new ObjectOutputStream(buff);
            
            ost.writeObject(a);
            
            ost.close();
            }catch(IOException e){
                    
                System.err.println("Error al escribir el archivo");
            }
    }
    
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);
        

        //menu();
        
        int sel = menu();
        do{
            switch(sel){
                case 1: 
                    
                    Archivador a = new Archivador();
                    
                    a = leerArchivador();
                    
                    if(a!=null){
                       a.listar();
                    }
                   
                    sel = menu();
                    break;
                    
                case 2:
                    
                    a = leerArchivador();
                    if(a == null){
                        a = new Archivador();
                    }
                    
                    
                    System.out.println("Nombre:");
                    String nom = tcl.nextLine();
                    System.out.println("Apellidos:");
                    String ap = tcl.nextLine();
                    System.out.println("Edad:");
                    int edad = tcl.nextInt();
                    tcl.nextLine();
                    
                    Ficha f = new Ficha(nom, ap, edad);
                    
                    a.guardar(f);
                    
                    escribirArchivador(a);
                    
                    sel = menu();
                    break;
               
                case 3: 
                    System.out.println("!Gracias por su visita, hasta pronto!");
                    sel = 4;
                    break;

                default: 
                    System.err.println("Opción no válida. Hasta pronto!");
                    break;
            }
        }while(sel!=4);
        
        
        

                

        
    }
    
}
