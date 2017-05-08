
package Ejercicios4;

import java.util.*;
import java.io.*;

public class ExeMiAgenda{
    
    static Scanner tcl = new Scanner(System.in);
    
    public static void menu(){  //Podemos introducirla de golpe con: psvm + tab
        System.out.println("********************");
        System.out.println("*     MiAgenda     *");
        System.out.println("********************");
        System.out.println("");
        System.out.println("¿Que desea hacer?");
        System.out.println("1. Ver agenda");
        System.out.println("2. Añadir contacto");
        System.out.println("3. Salir");
        System.out.println("");
        System.out.println("********************");
        int sel = tcl.nextInt();
        tcl.nextLine(); //Limpiar Buffer
        
        switch(sel){
            case 1: 
                try{
                    //Lineas para la lectura de ficheros
                    FileInputStream file = new FileInputStream("agendaObject.dat");
                    //BufferedInputStream buff = new BufferedInputStream(file);
                    ObjectInputStream ist = new ObjectInputStream(file);
                    
                    boolean end = false;
                    do{
                        try{
                  
                        MiAgenda agenda = new MiAgenda();
                        agenda = (MiAgenda) ist.readObject();

                        System.out.println("");
                        System.out.println("####################");
                        System.out.print("Nombre: " + agenda.getNombre());
                        System.out.print("\nDirección: " + agenda.getNombre());

                        for(int i=0; i<agenda.getTelefono().size();i++){
                            System.out.print("\nTeléfono: "+agenda.getTelefono().get(i));
                        }

                        for(int i=0; i<agenda.getEmail().size();i++){
                            System.out.print("\nE-Mail: "+agenda.getEmail().get(i));
                        }
                        System.out.println("");
                        System.out.println("####################");
                        System.out.println("");
                        }catch(IOException e){
                            end=true;
                            System.out.println("Fin de fichero");
                            System.out.println(e.getMessage());
                        }
                    }while(!end);
                    
                    ist.close();
                    
                }catch(IOException e){
                    System.err.println("Error en la lectura del archivo");
                }catch(ClassNotFoundException e){
                    System.err.println("Error al encontrar la clase");
                }
                
                menu();
                break;
                
            case 2:                 
                ArrayList<String> tlf = new ArrayList();
                ArrayList<String> email = new ArrayList();
                
                System.out.println("Nombre:");
                String nom = tcl.nextLine();
                
                System.out.println("Dirección:");
                String dir = tcl.nextLine();
                
                System.out.println("Teléfono:");
                String telf = tcl.nextLine();
                tlf.add(telf);
                System.out.println("********************");
                System.out.println("¿Desea añadir otro teléfono?");
                System.out.println("(1.Si 2.No)");
                System.out.println("********************");
                int s = tcl.nextInt();
                tcl.nextLine();
                while (s == 1) {
                    System.out.println("Teléfono:");
                    telf = tcl.nextLine();
                    tlf.add(telf);
                    System.out.println("********************");
                    System.out.println("¿Desea añadir otro teléfono?");
                    System.out.println("(1.Si 2.No)");
                    System.out.println("********************");
                    s = tcl.nextInt();
                    tcl.nextLine();
                }
                
                System.out.println("E-Mail:");
                String mail = tcl.nextLine();
                email.add(mail);
                System.out.println("********************");
                System.out.println("¿Desea añadir otro E-Mail?");
                System.out.println("(1.Si 2.No)");
                System.out.println("********************");
                int se = tcl.nextInt();
                tcl.nextLine();
                while (se == 1) {
                    System.out.println("E-Mail:");
                    mail = tcl.nextLine();
                    email.add(mail);
                    System.out.println("********************");
                    System.out.println("¿Desea añadir otro E-Mail?");
                    System.out.println("(1.Si 2.No)");
                    System.out.println("********************");
                    se = tcl.nextInt();
                    tcl.nextLine();
                }
             
                try{
                    FileOutputStream fil = new FileOutputStream("agendaObject.dat",true);
                    //BufferedOutputStream buff = new BufferedOutputStream(fil);
                    ObjectOutputStream ost = new ObjectOutputStream(fil);
                    ost.writeUnshared(new MiAgenda(nom,dir,tlf,email));
                    ost.close();
                }catch(IOException e){
                    System.err.println("Error al escribir el archivo");
                }
                
                menu();
                break;
                
            case 3: 
                System.out.println("Hasta pronto");
                break;
            default:
                System.err.println("Entrada no valida. Seleccione una opción correcta.");
                menu();
        }

    }
    
    public static void main(String args[]) {
            menu();
    }
    
}
