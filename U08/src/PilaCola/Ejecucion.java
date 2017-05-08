//
package PilaCola;

public class Ejecucion{
    public static void main(String[] args){
        Cola col = new Cola();
        col.insert("uno");
        col.insert("dos");
        col.insert("tres");
        col.insert("cuatro");
        System.out.println("Los elementos de la cola FIFO son:");
        int aux = col.size();
        for (int i = 0; i < aux; i++) {
            System.out.print(col.remove()+ ",");
        }
        System.out.println(" ");
        
        Pila pil = new Pila();
        pil.insert("uno");
        pil.insert("dos");
        pil.insert("tres");
        pil.insert("cuatro");
        System.out.println("Los elementos de la pila LIFO son:");
        int aux2 = pil.size();
        for (int i = 0; i < aux; i++) {
            System.out.print(pil.remove()+ ",");
        }
        System.out.println(" ");
    }
    
}
