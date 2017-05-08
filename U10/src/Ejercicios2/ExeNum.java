
package Ejercicios2;

import java.util.*;
import java.io.*;


public class ExeNum {

    public static void main(String args[]){
        
        RandomAccessFile raf = null;
        
        try{
            raf = new RandomAccessFile("numeros.txt", "rw");
            
            for(int num=0; num<1000; num++){
                int cont=0;
                for(int i=num-1;i>1;i--){
                    if(num%i==0){
                        cont++;
                    }
                }
                if(cont==0){
                    raf.writeInt(num);
                }
            }
            
            //Para leer la mitad del documento
            long tam = raf.length()/2;
            long pos;
            int num;
            raf.seek(0);
            pos=raf.getFilePointer();
            while (pos<tam){
               num=raf.readInt();
                System.out.println(num);
                pos=raf.getFilePointer();
            }
            
        }catch (FileNotFoundException e){
            System.out.println("ERROR: Fichero no encontrado");
            System.out.println(e.getMessage());
        }catch ( Exception e){
            System.out.println("ERROR: Error en la lectura del fichero");
            System.out.println(e.getMessage());
        }finally{
            try{
                if(raf != null){
                    raf.close();
                }
            }catch (Exception e){
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
        
    }
    
}
