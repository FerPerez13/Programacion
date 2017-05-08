
package Herencia1;

import java.util.*;

public class Multimedia {
    
    private String titulo, autor, duracion;
    private format formato;

    public Multimedia(String titulo, String autor, String duracion, format formato) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.formato = formato;
    }
    //Get
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getDuracion() {
        return duracion;
    }

    public format getFormato() {
        return formato;
    }
    //Set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setFormato(format formato) {
        this.formato = formato;
    }
    
    public String toString(){
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nFormato: " + 
                formato + "\nDuración: " + duracion + "\n";
    }
    
    public boolean equals(Multimedia obj){
        boolean igual= false;
        if(this.titulo.equalsIgnoreCase(obj.getTitulo()) && this.autor.equalsIgnoreCase(obj.getAutor())){
            igual = true;
        }else{
            igual = false;
        }
        return igual;
    }
}
