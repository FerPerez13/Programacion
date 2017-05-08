//Ejercicio 1 Practica 5. Fernando Pérez Andrés

package Practica3;


public class Motor {
    private int LitrosAceite=0;
    private int CV;
    
    public void Motor(){
        LitrosAceite=0;
        CV=(int)(Math.random()*100);
    }
    
    public void setLitrosAceite(int litros){
        LitrosAceite=LitrosAceite+litros;
    }
    
    public int getCV(){
        return CV;
    }
    public int getLitrosAceite(){
        return LitrosAceite;
    }
    
}
