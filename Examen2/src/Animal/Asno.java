
package Animal;


public class Asno implements Animal{
    
    private String AsnoDice="IIIIIIII OOOOOOOO";
    
    public Asno(){        
    }

    public void hablar() 
    {
        System.out.println("***** Asno *****");
        System.out.println(AsnoDice+'\n');
    }

}
