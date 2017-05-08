// Ejercicio 3. Fernando Pérez Andrés
package Ejercicios1;

import java.io.*;
import java.util.Scanner;

public class LineasLargas {
    
    public static void main (String args[]){
        
        Scanner tcl = new Scanner(System.in);
        System.out.println("Dime el nombre del fichero a leer: ");
        String fich = tcl.nextLine();
        System.out.println("Dime el nombre del fichero a crear: ");
        String newFich = tcl.nextLine();
        System.out.println("Máximo de caracteres:");
        int num1 = tcl.nextInt();
        System.out.println("Mínimo de caracteres:");
        int num2 = tcl.nextInt();
        
        BufferedReader br = null;
        BufferedWriter bw = null;
        try{
            br = new BufferedReader(new FileReader(fich));
            bw = new BufferedWriter(new FileWriter(newFich));
            String texto = br.readLine();
            while (texto != null){
                if(texto.length()<=num1 && texto.length()>=num2){
                    bw.write(texto);
                    bw.newLine();
                }
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
