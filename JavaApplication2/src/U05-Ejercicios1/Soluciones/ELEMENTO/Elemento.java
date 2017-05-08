/*
 * Escribe una clase llamada Elemento, que disponga de un atributo con su nombre. 
 * La clase debe contener un método llamado númeroDeElementos que devuelve el número total de elementos 
 * que se han instanciado.
 */
package ELEMENTO;

public class Elemento {

    private String nombre;
    private static int nElementos = 0;

    public Elemento(String n) {
        nombre = n;
        nElementos++;
    }

    public static void numeroDeElementos() {
        System.out.println("Número de elementos: " + nElementos);
    }
}
