//Ejercicio 1. Fernando Pérez Andrés

package Ejercicios2;

import java.util.*;
import java.io.*;


public class ConvertirMayusculas {
    public static void main(String args[]){
        
        Scanner tcl = new Scanner(System.in);
        String nomfich = "Ej1.txt";
        
        System.out.println("¿Que posición quieres que cambie el caracter?");
        int pos = tcl.nextInt();
        
        RandomAccessFile raf = null;
        
        try{
            while(pos != -1){
                raf = new RandomAccessFile(nomfich, "rw");
                long tam = raf.length();
                raf.seek(pos); //seek = Posiciona el puntero en 'pos'
                if(raf.getFilePointer()<tam){
                    int car = raf.read();
                    raf.seek(raf.getFilePointer()-1);
                    raf.write(Character.toUpperCase(car));
                }
                System.out.println("¿Que posición quieres que cambie el caracter?");
                pos = tcl.nextInt();
            }
        }catch (FileNotFoundException e){
            System.out.println("ERROR: Fichero no encontrado");
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("ERROR: Fallo de lectura/escritura del fichero");
            System.out.println(e.getMessage());            
        }finally{
            try{
                if(raf != null){
                    raf.close();
                }
            }catch (Exception e){
                System.out.println("ERROR: Fallo al cerrar fichero");
                System.out.println(e.getMessage());
            }
        }
    }
}
