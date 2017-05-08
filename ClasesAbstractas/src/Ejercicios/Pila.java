
package Ejercicios;

public class Pila extends ColeccionSimple{ 
    
    public Pila(){ //Se llama al constructor de la superclase
    }
    
    public void añadir(Object o){
        getLista().addFirst(o);
    }
}
