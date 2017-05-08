
package Metegoles;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SeleccionFutbol {
    
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;
    
    public SeleccionFutbol(){
        this.id = 0;
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
    }

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //Getters y Setters
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Métodos de la clase SeleccionFutbol
    
    public void Concentrarse(){
        System.out.println("Estamos concentrados");
    }
    
    public void Viajar(){
        System.out.println("Viajando al próximo partido");
    }
    
    //Métodos para leer ficheros y escribir ficheros 
    
    public static ArrayList<SeleccionFutbol> leerSeleccion(){
        try{
            FileInputStream file = new FileInputStream("Seleccion.dat");
            BufferedInputStream buf = new BufferedInputStream(file);
            ObjectInputStream ist = new ObjectInputStream(buf);

            ArrayList<SeleccionFutbol> selec = (ArrayList<SeleccionFutbol>) ist.readObject();

            ist.close();
            
            return selec;
            
            }catch(IOException e){
               System.err.println("El archivo todavía no existe");
               return null;
            }catch(ClassNotFoundException e){
               System.err.println("ERROR: Clase no encontrada");
               return null;
            }
    }
    
    public static void escribirSeleccion(ArrayList<SeleccionFutbol> selec){
        FileOutputStream fos = null;
        BufferedOutputStream buf = null;
        ObjectOutputStream oos = null;
        try{
            File fil = new File("Seleccion.dat");
            fos = new FileOutputStream(fil);
            buf = new BufferedOutputStream(fos);
            oos = new ObjectOutputStream(buf);
                    
            oos.writeObject(selec);
                    
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
    }
}
