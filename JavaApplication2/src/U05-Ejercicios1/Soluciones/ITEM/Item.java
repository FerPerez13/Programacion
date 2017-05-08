/*
* Escribe una clase de nombre Item, que acepta un nombre en su constructor. 
* Cada ítem debe disponer de un número que servirá como identificador único de cada objeto. 
* La clase ítem dispondrá de un método para obtener el identificador y otro para obtener el nombre. 
* Haga un programa de prueba que genere tres ítems, “uno”, “dos” y “tres” 
* y luego escriba los nombres e identificadores de cada ítem.
 */
package ITEM;

public class Item {

    private String nombre;
    private static int aux=0;
    private int identificador;
    
public Item(String n) {
        nombre = n;
        aux++;
        identificador=aux;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdenficador() {
        return identificador;
    }
}
