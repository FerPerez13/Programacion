// Ejercicio 3 Practica 3. Fernando Pérez Andrés
package Practica3;

public class Garaje {
    private Coche coche=new Coche();
    private String averia;
    private int numCoches; // Numero de coches que ha atendido
    private boolean puedoCoche=true; // te dice si puedes aceptar coche nuevo
    
    public boolean aceptarCoche(Coche coche, String averia){
        if(puedoCoche){
            this.coche=coche;
            this.averia=averia;
            this.numCoches++;
            if(averia=="Aceite"){
                this.coche.getMotor().setLitrosAceite(10);
            }
            System.out.println("Perfecto... Enseguida lo tendrá.");
            coche.setAcumularAveria(Math.random()*1000);
            puedoCoche=false;
            return true;
            
        }else{
            System.out.println("No puedo atenderle ahora mismo");
            return false;
        }
    }
    
    public void devolverCoche(){
        puedoCoche=true;
    }
    
}
