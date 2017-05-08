
package Animal;


public class Perro implements Animal{
    
    private String PerroDice="Guau";

    
    public Perro(){        
    }
    
    public void hablar() 
    {
        System.out.println("***** PERRO *****");
        System.out.println(PerroDice+'\n');
    }
    
}
