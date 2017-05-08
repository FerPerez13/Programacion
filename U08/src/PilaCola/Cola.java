//FerPerez13
package PilaCola;

import java.util.*;

public class Cola implements ColaPila{
    private LinkedList cola = null;
    
    public Cola(){
        cola = new LinkedList();
    }
    
    public void insert(Object ob){
        cola.add(ob);
    }
    
    public Object remove(){
        return cola.remove(0);
    }
    
    public int size (){
        return cola.size();
    }
}
