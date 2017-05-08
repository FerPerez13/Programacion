//Ejercicio 1. Fernando Pérez Andrés    

package Ejercicios1;

import java.util.*;
import java.io.*;

public class De2FicherosSaco1 {
    public static void main(String args[]){
        Scanner tcl = new Scanner(System.in);
        
        System.out.println("Nombre del primer archivo:");
        String nomFich1 = tcl.nextLine();
        System.out.println("Nombre del segundo archivo:");
        String nomFich2 = tcl.nextLine();
        System.out.println("¿Cómo quieres llamar al nuevo archivo?");
        String nomNew = tcl.nextLine();
        System.out.println("¿Como separo las líneas?");
        String sep = tcl.nextLine();
        
        // Falta hacer el Código
        BufferedReader br1 = null;
        BufferedReader br2 = null;
        BufferedWriter bw = null;
        
        try{
            br1 = new BufferedReader(new FileReader(nomFich1));
            br2 = new BufferedReader(new FileReader(nomFich2));
            bw = new BufferedWriter(new FileWriter(nomNew, true));
            
            String txt1 = br1.readLine();
            String txt2 = br2.readLine();
            String text = txt1 + " " + sep + " " + txt2;
            while(txt1 != null || txt2!=null) {
                if(txt1==null){
                    txt1 = "";
                }
                if(txt2==null){
                    txt2="";
                }
                bw.write(text);
                bw.newLine();
                txt1 = br1.readLine();
                txt2 = br2.readLine();
                text = txt1 + " " + sep + " " + txt2;
            }
            
        }catch (FileNotFoundException e){
            System.out.println("ERROR: Fichero no encontrado");
            System.out.println(e.getMessage());
        }catch ( Exception e){
            System.out.println("ERROR: Error en la lectura del fichero");
            System.out.println(e.getMessage());
        }finally{
            try{
                if(br1 != null){
                    br1.close();
                }
                if(br2 != null){
                    br2.close();
                }
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
