
package Ejercicios;

import java.util.*;

public abstract class ColeccionSimple { // abstract lo ponemos como declaración de la clase abstracta
   
    private LinkedList<Object> lista; // Declarado para que almacene objetos
    
    public ColeccionSimple(){
        lista = new LinkedList<Object>();
    }
    
    public abstract void añadir(Object o);
    
    public Object extraer(){
        return lista.removeFirst(); //removeFirst() saca el primero y lo elimina
    }
    
    public boolean estaVacia(){
        return lista.isEmpty();
    }
    
    public Object primero(){
        return lista.getFirst();
    }
    
    public String toString(){
        return lista.toString();
    }
    
    protected LinkedList<Object> getLista(){ //Método para que puedan acceder las subclases
        return lista;
    }
}

