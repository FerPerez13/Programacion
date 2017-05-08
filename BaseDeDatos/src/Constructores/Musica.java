/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructores;

/**
 *
 * @author mati
 */
public class Musica {
    
    private final Integer id;
    private String titulo;
    private String descripcion;
    private String duracion;
    
    public Musica() {
        this.id = null;
        this.titulo = null;
        this.descripcion = null;
        this.duracion= null;
    }

    public Musica(Integer id, String titulo, String descripcion, String duracion) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.duracion = duracion;
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
    public String toString() {
        return "Musica{" + "id=" + id + ", Titulo=" + titulo + ", Descripcion=" + descripcion + ", Duracion=" + duracion + '}';
    }
    
}
