
package Empresa;

import java.util.*;

public class Persona {
    
    private String nombre;
    private int edad;
    
    //Constructores
    
    public Persona(){
        this.nombre="";
        this.edad=0;
    }
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Getter y Setter
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Métodos pedidos por el ejercicio
    
    public void introDatos(){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Nombre:");
        String nombre = tcl.nextLine();
        System.out.println("Edad:");
        int edad = tcl.nextInt();
        tcl.nextLine();
        
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
    
    
}
