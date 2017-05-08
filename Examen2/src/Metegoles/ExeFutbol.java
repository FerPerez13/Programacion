
package Metegoles;

import java.util.*;
import java.io.*;

public class ExeFutbol {
    
    public static int menu(){
        Scanner tcl = new Scanner(System.in);
        
        System.out.println("----------------------");
        System.out.println("-- Seleccion Futbol --");
        System.out.println("----------------------");
        System.out.println("");
        System.out.println("1. Introducir datos");
        System.out.println("2. Listar futbolistas");
        System.out.println("3. Guardar futbolistas");
        System.out.println("4. Visualizar");
        System.out.println("5. Salir");
        System.out.println("");
        System.out.println("Seleccione una opción:");
        int sel = tcl.nextInt();
        tcl.nextLine();
        System.out.println("----------------------");
        return sel;
    }

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        ArrayList<SeleccionFutbol> Seleccion = new ArrayList();
        //Leemos del archivo Seleccion.dat
        try{
            FileInputStream file = new FileInputStream("Seleccion.dat");
            BufferedInputStream buf = new BufferedInputStream(file);
            ObjectInputStream ist = new ObjectInputStream(buf);

            ArrayList<SeleccionFutbol> selec = (ArrayList<SeleccionFutbol>) ist.readObject();

            ist.close();
            
            
            }catch(IOException e){
               System.err.println("El archivo todavía no existe");
            }catch(ClassNotFoundException e){
               System.err.println("ERROR: Clase no encontrada");
            }

        int sel = menu();
        while(sel<6){
            switch(sel){
                case 1:
                    System.out.println("-- Introducir datos --");
                    System.out.println("1. Futbolista");
                    System.out.println("2. Entrenador");
                    System.out.println("3. Masajista");
                    System.out.println("");
                    System.out.println("Seleccione una opción:");
                    int sel2 = tcl.nextInt();
                    tcl.nextLine();
                    System.out.println("----------------------");
                        switch(sel2){
                            case 1: 
                                System.out.println("-- Datos futbolista --");
                                System.out.println("DNI (Sin letra):");
                                int dni = tcl.nextInt();
                                tcl.nextLine();
                                System.out.println("Nombre:");
                                String nom = tcl.nextLine();
                                System.out.println("Apellidos:");
                                String ap = tcl.nextLine();
                                System.out.println("Edad:"); 
                                int edad = tcl.nextInt();
                                tcl.nextLine();
                                System.out.println("Dorsal:");
                                int dorsal = tcl.nextInt();
                                tcl.nextLine();
                                System.out.println("Demarcación:");
                                String dem = tcl.nextLine();
                                
                                Futbolista fut = new Futbolista(dorsal, dem, dni,nom,ap,edad);
                                Seleccion.add(fut);
                                break;
                            case 2:
                                System.out.println("-- Datos Entrenador --");
                                System.out.println("DNI (Sin letra):");
                                dni = tcl.nextInt();
                                tcl.nextLine();
                                System.out.println("Nombre:");
                                nom = tcl.nextLine();
                                System.out.println("Apellidos:");
                                ap = tcl.nextLine();
                                System.out.println("Edad:"); 
                                edad = tcl.nextInt();
                                tcl.nextLine();
                                System.out.println("Nº Federacion:");
                                String id = tcl.nextLine();

                                Entrenador entr = new Entrenador(id, dni, nom, ap, edad);
                                Seleccion.add(entr);
                                break;
                            case 3: 
                                System.out.println("-- Datos Masajista --");
                                System.out.println("DNI (Sin letra):");
                                dni = tcl.nextInt();
                                tcl.nextLine();
                                System.out.println("Nombre:");
                                nom = tcl.nextLine();
                                System.out.println("Apellidos:");
                                ap = tcl.nextLine();
                                System.out.println("Edad:"); 
                                edad = tcl.nextInt();
                                tcl.nextLine();
                                System.out.println("Titulación:");
                                String tit = tcl.nextLine();
                                System.out.println("Años de experiencia");
                                int ano = tcl.nextInt();
                                tcl.nextLine();
                                
                                Masajista mas = new Masajista(tit,ano,dni,nom,ap,edad);
                                Seleccion.add(mas);  
                                break;
                        }   
                    sel = menu();
                    break;
                case 2: 
                    System.out.println("-- Listar futbolistas ordenados --");
                    System.out.println("1. Por dorsal");
                    System.out.println("2. Por demarcacion");
                    System.out.println("Seleccione una opción:");
                    int sel3 = tcl.nextInt();
                    tcl.nextLine();
                    System.out.println("----------------------");
                    
                    switch(sel3){
                        case 1: 
                            System.out.println("-- Por dorsal --");
                            System.out.println("");
                            
                            System.out.println("No me ha dado tiempo");
                            break;
                        case 2: 
                            System.out.println("-- Por demarcación --");
                            System.out.println("");
                            System.out.println("No me ha dado tiempo");
                            // Ordenar lista por posicion
                            break;
                    }
                    sel = menu();
                    break;
                    
                
                case 3: 
                    System.out.println("-- Guardar futbolistas --");
                   
                    FileOutputStream fos = null;
                    BufferedOutputStream buf = null;
                    ObjectOutputStream oos = null;
                    try{
                        File fil = new File("Seleccion.dat");
                        fos = new FileOutputStream(fil);
                        buf = new BufferedOutputStream(fos);
                        oos = new ObjectOutputStream(buf);

                        oos.writeObject(Seleccion);

                    }catch (FileNotFoundException e){
                        System.out.println("ERROR: Fichero no encontrado");
                        System.out.println(e.getMessage());
                    }catch ( Exception e){
                        System.out.println("ERROR: Error en la escritura del fichero");
                        System.out.println(e.getMessage());
                    }finally{
                        try{
                            if(oos != null){
                                oos.close();
                            }
                        }catch (Exception e){
                        System.out.println("Error al cerrar el fichero");
                        System.out.println(e.getMessage());
                        }
                     }
                    sel = menu();
                    break;

                case 4: 
                    System.out.println("-- Visualizar --");
                    
                    System.out.println("1. Futbolistas");
                    System.out.println("2. Entrenadores");
                    System.out.println("3. Masajista");
                    
                    System.out.println("Seleccione una opción:");
                    int sel4 = tcl.nextInt();
                    tcl.nextLine();
                    
                    switch(sel4){
                        case 1: 
                            System.out.println("-- Futbolistas --");
                            System.out.println("");
                            
                            // Ver todos los futbolistas
                            System.out.println("No me ha dado tiempo");
                            break;
                        case 2: 
                            System.out.println("-- Entrenadores --");
                            System.out.println("");
                            
                            // Ver todos los entrenadores
                            System.out.println("No me ha dado tiempo");
                            break;
                        case 3: 
                            System.out.println("-- Masajistas --");
                            System.out.println("");
                            
                            //Ver todos los masajistas
                            System.out.println("No me ha dado tiempo");
                            break;
                    }
                    sel = menu();
                    break;
                    
                case 5: 
                    System.out.println("Hasta pronto!!");
                    sel = 6; //Para salir del bucle
            }
        }
        
        
    }

    
}
