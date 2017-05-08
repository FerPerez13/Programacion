/*
 Se desea representar las bombillas que pueda haber en una casa. 
 * Cada bombilla tiene asociada un interruptor y sólo uno. 

 * Así mismo, existe un interruptor general de la casa. Un interruptor tiene dos estados, ON y OFF. 
 * Una bombilla luce si el interruptor general de la casa está ON y su interruptor asociado también. 
 * Escribe una clase de nombre Bombilla que permita modelar la información anterior. Para ello, la clase dispondrá de:
 un método para cambiar el estado del interruptor de la bombilla.
 Un método para cambiar el estado del interruptor general de la casa.
 Un método que determina si una bombilla está luciendo o no.
 */
package BOMBILLA;

public class Bombilla {

    private boolean interruptor = false;
    private static boolean interruptorGeneral = true;

    public void enciende() {
        interruptor = true;
    }

    public void apaga() {
        interruptor = false;
    }

    public static void enciendeIG() {
        interruptorGeneral = true;
    }

    public static void apagaIG() {
        interruptorGeneral = false;
    }

    public static void estadoIG() {
        if (interruptorGeneral == true) {
            System.out.println("INTERRUPTOR GENERAL: ON");
        } else {
            System.out.println("INTERRUPTOR GENERAL: OFF");
        }
    }

    public void estaLuciendo() {
        if (interruptor == true && interruptorGeneral == true) {
            System.out.println("ON");
        } else {
            System.out.println("OFF");
        }

    }
}
