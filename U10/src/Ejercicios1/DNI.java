//Ejercicio 4. Fernando Pérez Andrés
package Ejercicios1;

import java.util.*;
import java.io.*;

public class DNI {
    public static void main(String args[]){
        
        Scanner tcl = new Scanner(System.in);
        BufferedWriter bwD = null;
        BufferedWriter bwN = null;

        try{
            System.out.println("Dime los números de tu DNI:");
            int dni = tcl.nextInt();
            String dni_str = dni+""; // El String para el DNI
            int longDNI=dni_str.length();
            if(longDNI<8){
                for(int i=0; i<(8-longDNI);i++){
                    dni_str = "0"+dni_str;
                }
            }

            bwD = new BufferedWriter(new FileWriter("dni.txt", true));
            bwN = new BufferedWriter(new FileWriter("nif.txt", true));
            
            bwD.write(dni_str);
            bwD.newLine();
            
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            
            int pos_letra = dni%23;
            dni_str = dni_str + letras.charAt(pos_letra);
                        
            bwN.write(dni_str);
            bwN.newLine();
            
        }catch (FileNotFoundException e){
            System.out.println("ERROR: Fichero no encontrado");
            System.out.println(e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("ERROR: No pongas letras... Yo me encargaré de ponerlas.");
            System.out.println(e.getMessage());
        }catch ( Exception e){
            System.out.println("ERROR: Error en la lectura del fichero");
            System.out.println(e.getMessage());
        }finally{
            try{
                if(bwD != null){
                    bwD.close();
                }
                if(bwN != null){
                    bwN.close();
                }
            }catch (Exception e){
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }

        
        
    }
}
