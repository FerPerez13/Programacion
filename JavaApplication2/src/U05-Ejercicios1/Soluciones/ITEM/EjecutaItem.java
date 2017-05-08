/*

 */
package ITEM;

public class EjecutaItem {

    public static void main(String args[]) {
        Item uno = new Item("Uno");
        Item dos = new Item("Dos");
        Item tres = new Item("Tres");

        System.out.println("Id: " + uno.getIdenficador() + ", Nombre: " + uno.getNombre());
        System.out.println("Id: " + dos.getIdenficador() + ", Nombre: " + dos.getNombre());
        System.out.println("Id: " + tres.getIdenficador() + ", Nombre: " + tres.getNombre());
    }
}
