//Fernando Pérez Andrés

package PilaCola;

import java.util.*;

public class Pila implements ColaPila {
    private LinkedList pila = null;
    
    public Pila(){
        pila = new LinkedList();
    }
    
    public void insert(Object ob){
        pila.add(0, ob);
    }
    
    public Object remove(){
        return pila.remove(0);
    }
    
    public int size(){
        return pila.size();
    }
}

