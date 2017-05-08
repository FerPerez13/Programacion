
package Ejercicios4;

import java.util.*;
import java.io.*;


public class MiAgenda implements Serializable{ //El Serializable se pone en la clase donde está el objeto que vamos a guardar en el archivo
    
    private String nombre;
    private String direccion;
    private ArrayList<String> telefono;
    private ArrayList<String> email;
    
    public MiAgenda(){
        this.nombre = "";
        this.direccion = "";
        this.telefono = null;
        this.email = null;
    }

    public MiAgenda(String nombre, String direccion, ArrayList<String> telefono, ArrayList<String> email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<String> getTelefono() {
        return telefono;
    }

    public ArrayList<String> getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(ArrayList<String> telefono) {
        this.telefono = telefono;
    }

    public void setEmail(ArrayList<String> email) {
        this.email = email;
    }
}
