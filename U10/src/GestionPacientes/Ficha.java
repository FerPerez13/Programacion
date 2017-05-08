// Ficha de Gestion de Pacientes

package GestionPacientes;

import java.util.*;
import java.io.*;

public class Ficha implements Serializable{
    private String nom = null;
    private String ape = null;
    private int edad = 0; 
    
    public Ficha(String nom, String ape, int edad){
        this.nom = nom;
        this.ape = ape; 
        this.edad = edad; 
    }
    
    public String toString(){
        return "Nombre: "+nom+" Apellidos: "+ape+" Edad: "+edad;
    }       
}
