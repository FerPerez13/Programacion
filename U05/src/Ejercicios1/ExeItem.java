//2ª Parte Ejercicio 5 pag3. Fernando Pérez Andrés

package Practica5;


public class ExeItem {
    public static void main (String args[]){
        Item uno=new Item("Uno");
        Item dos=new Item("Dos");
        Item tres=new Item("Tres");
        
        System.out.println(uno.getNom()+" y " +uno.getIdentificador());
        System.out.println(dos.getNom()+" y " +dos.getIdentificador());
        System.out.println(tres.getNom()+" y " +tres.getIdentificador());
    }
}
