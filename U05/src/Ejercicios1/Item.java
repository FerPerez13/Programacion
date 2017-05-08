// Ejercicio 5 pag3. Fernando Pérez Andrés

package Practica5;


public class Item {
    private String nom;
    private static int aux=0; // lo ponemos static para que al cambiar de objeto siga sumandose
    private int identificador;
    
    public Item(String n){
        nom=n;
        aux++;
        identificador=aux;
    }
    public String getNom(){
        return nom;
    }
    public int getIdentificador(){
        return identificador;
    }
    
}
