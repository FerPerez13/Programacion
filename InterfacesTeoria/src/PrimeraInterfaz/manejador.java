/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeraInterfaz;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*class manejador implements WindowListener{ // Escucha la ventana que es lo que tiene que hacer
    
//Tenemos que implementar todo este código
    public void windowClosing(WindowEvent e){
        System.out.println("Saliendo...");
        System.exit(0);
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }*/

//Implementamos estas líenas y funciona igual que con todas las anteriores
class manejador extends WindowAdapter{ //Adaptador para la ventana

    public void windowClosing(WindowEvent e){ //Cerrar de ventana
    System.out.println("Saliendo ...");
    System.exit(0);

    }
    
    

}
