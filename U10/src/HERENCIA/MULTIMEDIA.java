package HERENCIA;

import java.io.*;

public class MULTIMEDIA implements Serializable{
    private String titulo, autor, duracion;
    private format formato;

    public MULTIMEDIA(String titulo, String autor, format formato, String duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public format getFormato() {
        return formato;
    }

    public void setFormato(format formato) {
        this.formato = formato;
    }

    public String toString() {
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nFormato: " + 
                formato + "\nDuración: " + duracion + "\n";
    }

    public boolean equals(MULTIMEDIA m) {
        boolean igual = false;

        if (m.getTitulo().equalsIgnoreCase(this.getTitulo()) && 
                m.getAutor().equalsIgnoreCase(this.getAutor())) {
            igual = true;
        } else {
            igual = false;
        }
        return igual;
    }
}
