
package PrimeraInterfaz;

import java.awt.Container;
import java.awt.event.WindowListener;
import javax.swing.*;
import java.awt.event.*; 
import java.awt.*;

class frame extends JFrame {
    
    public frame(){
        setTitle("BOTONES!!!"); // Texto del título
        setSize(500,500); //Tamaño de la ventana 
        
        addWindowListener ((WindowListener) new manejador()); //La ventana escucha
        
        // Creamos el Panel
        Container contentpanel = getContentPane();
        JPanel panel = new JPanel();
        contentpanel.add(panel); // Añadimos el Panel al Content

        panel.setBackground(Color.GREEN); // Ventana de color COLOR
        
        // Añadimos un boton
        
        panel.setLayout(null);
        JButton boton = new JButton(); // Crear el boton
        boton.setBounds(250,250,50,50); //Posición y tamaño del boton
        panel.add(boton); // Añadir el Boton
        
        // Añadimos una serie de botones
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT,5,10);
        contentpanel.setLayout(fl);
        for(int i=0; i<3;i++){
            JButton button = new JButton("Boton"+(i+1));
            button.setPreferredSize(new Dimension(100,25));
            contentpanel.add(button);
        }
    }
}

public class PrimeraInterfaz{
    public static void main(String[] args) {
        JFrame frame = new frame(); // Crear nueva interfaz
        frame.setVisible(true); // Hacerla visible 
        System.out.println("Ejecutando ...");
    }
}
