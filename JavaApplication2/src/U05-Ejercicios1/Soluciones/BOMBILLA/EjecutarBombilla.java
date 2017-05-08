/*
 * Escribe un programa que utilice la clase Bombilla del apartado anterior. 
 * Para ello, se creará una Bombilla y se visualizará por pantalla si luce o no. 
 * Luego se pulsa el interruptor de la Bombilla y se vuelve a visualizar el estado de la misma. 
 * Por último, se pulsa el interruptor general y se visualiza el estado.
 */
package BOMBILLA;

public class EjecutarBombilla {

    public static void main(String args[]) {
        Bombilla habitacion = new Bombilla();
        Bombilla cocina = new Bombilla();
        Bombilla salon = new Bombilla();
        Bombilla comedor = new Bombilla();

       
       //Interruptor General por defecto encendido 
        //Consulto estado Bombillas
          System.out.print("Habitación: ");
        habitacion.estaLuciendo();
         System.out.print("Cocina: ");
        cocina.estaLuciendo();
         System.out.print("Salón: ");
        salon.estaLuciendo();
         System.out.print("Comedor: ");
        comedor.estaLuciendo();
        
        //Enchufo Bombillas
        habitacion.enciende();
        cocina.enciende();
        salon.enciende();
        comedor.enciende();
        
        //Consulto estado Bombillas
          System.out.print("Habitación: ");
        habitacion.estaLuciendo();
         System.out.print("Cocina: ");
        cocina.estaLuciendo();
         System.out.print("Salón: ");
        salon.estaLuciendo();
         System.out.print("Comedor: ");
        comedor.estaLuciendo();
        
        //Apagamos el Interruptor General
        Bombilla.apagaIG();
        Bombilla.estadoIG();
        
         //Consulto estado Bombillas
          System.out.print("Habitación: ");
        habitacion.estaLuciendo();
         System.out.print("Cocina: ");
        cocina.estaLuciendo();
         System.out.print("Salón: ");
        salon.estaLuciendo();
         System.out.print("Comedor: ");
        comedor.estaLuciendo();


    }
}
