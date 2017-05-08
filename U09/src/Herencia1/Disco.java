
package Herencia1;

public class Disco extends Multimedia{
    
    private String gen;
    
    public Disco(String titulo, String autor, String duracion, format formato, String gen){
        
        super(titulo, autor, duracion, formato);
        this.gen = gen;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }
    
    public String toString(){
        return super.toString()+"\nGénero: "+gen+"\n";
    }
}
