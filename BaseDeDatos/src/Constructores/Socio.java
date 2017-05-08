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
public class Socio {
    
    private final Integer id;
    private String nombre;
    private String ciudad;
    private String telefono;

    public Socio(Integer id, String nombre, String ciudad, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }
    public Socio() {
        this.id = null;
        this.nombre = null;
        this.ciudad = null;
        this.telefono = null;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String toString(){
        return "id="+ id + ", Nombre=" + nombre + ", Ciudad=" + ciudad + ", Num. Telefono=" + telefono + '}';
    }
    
}
