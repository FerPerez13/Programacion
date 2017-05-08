
package Herencia1;

public class Pelicula extends Multimedia{
    
    private String actorPrin, actrizPrin;
    
    public Pelicula(String titulo, String autor, String duracion, format formato, String actorPrin, String actrizPrin)throws Exception{
        super(titulo, autor, duracion, formato); //Utiliza el constructor de Multimedia aplicado a Pelicula
        if((actorPrin == null && actrizPrin==null) || (actorPrin.isEmpty()||actrizPrin.isEmpty())){
            throw new Exception("Datos incorrectos!");
        }else{
            this.actorPrin = actorPrin;
            this.actrizPrin = actrizPrin;
        }
    }

    public String getActorPrin() {
        return actorPrin;
    }

    public String getActrizPrin() {
        return actrizPrin;
    }

    public void setActorPrin(String actorPrin) {
        this.actorPrin = actorPrin;
    }

    public void setActrizPrin(String actrizPrin) {
        this.actrizPrin = actrizPrin;
    }
    
    public String toString(){
        return super.toString()+"\nActor Principal: "+actorPrin+"\nActriz Principal: "+actrizPrin;
        //Usamos el super para llamar a Multimedia y de ese modo poder añadir el resto
    }
    
    
    
}
