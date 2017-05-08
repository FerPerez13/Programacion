
package HERENCIA;

import java.io.*;

  public class E3G_MAIN {
      //LECTOR DE ARCHIVOS
      public static LISTAMULTIMEDIA1 leerMultimedia(){
        try{
            FileInputStream file = new FileInputStream("multimedia.dat");
            ObjectInputStream ist = new ObjectInputStream(file);           
            LISTAMULTIMEDIA1 listaMult = new LISTAMULTIMEDIA1(10);            
            listaMult = (LISTAMULTIMEDIA1) ist.readObject();            
            ist.close();
            return listaMult;
        }catch(IOException e){
               System.err.println("El archivo no existe");
               System.out.println(e.getMessage());
               return null;
        }catch(ClassNotFoundException e){
               System.err.println("ERROR: Clase no encontrada");
               return null;
        }
      }
      //EDITOR/CREADOR DE ARCHIVOS
      public static void escribirMultimedia(LISTAMULTIMEDIA1 obj){          
        try{
            FileOutputStream fil = new FileOutputStream("multimedia.dat");
            ObjectOutputStream ost = new ObjectOutputStream(fil);   
            ost.writeObject(obj);  
        }catch(IOException e){
                System.err.println("Error al escribir el archivo");
                System.out.println(e.getMessage());
        }
      }
      
      public static void main(String[] args) {
        LISTAMULTIMEDIA1 ListaMultimedia = new LISTAMULTIMEDIA1(10);
        
//Creamos 3 Discos
        try {
            DISCO Rihanna = new DISCO("Diamonds", "Rihanna", format.mp3, "4", "Pop");
            DISCO MagodeOz = new DISCO("Fiesta Pagana", "Mago de Oz", format.mp3, "5", "Rock");
            DISCO DavidGuetta = new DISCO("The World is mine", "David Guetta", format.mp3, "4", "Dance");
            
//Añado a la lista    
            ListaMultimedia.add(Rihanna);
            ListaMultimedia.add(MagodeOz);
            ListaMultimedia.add(DavidGuetta);
           
//Con esta línea escribimos en el archivo Multimedia.dat
            escribirMultimedia(ListaMultimedia); 

        } catch (Exception x) {
            System.out.println("Datos incorrectos. ListaMultimedia no creada");
            System.out.println(x.getMessage());
        }

        try {
            DISCO prueba = new DISCO("Mendoza", "Prueba", null, null, null);
            ListaMultimedia.add(prueba);

            escribirMultimedia(ListaMultimedia); 
            
        } catch (Exception x) {
            System.out.println("Datos incorrectos. ListaMultimedia no creada");
            System.out.println(x.getMessage());
        }
        
        LISTAMULTIMEDIA1 listMult = new LISTAMULTIMEDIA1(10);
        
        listMult = leerMultimedia();
        
        if(listMult != null){
            System.out.println(listMult.toString());
        }else{
            System.err.println("No hay nada dentro del Archivo");
        }
    }
}
