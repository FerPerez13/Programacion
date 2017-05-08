package GridLayout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gridLayout extends JFrame implements ActionListener {

    private JButton botones[];
    private final String nombres[] = {"uno", "dos", "tres", "cuatro", "cinco", "seis"};
    private boolean alternar = true;
    private Container contenedor;
    private GridLayout cuadricula1, cuadricula2;

    public gridLayout() {
        super("gridLayout");
        cuadricula1 = new GridLayout(2, 3, 10, 10);
        cuadricula2 = new GridLayout(3, 2);
        contenedor = getContentPane();
        contenedor.setLayout(cuadricula1);
        botones = new JButton[nombres.length];

        for (int cuenta = 0; cuenta < nombres.length; cuenta++) {
            botones[cuenta] = new JButton(nombres[cuenta]);
            botones[cuenta].addActionListener(this);
            botones[cuenta].setToolTipText("Cambia el esquema del GridLayout");
            contenedor.add(botones[cuenta]);
        }

        setSize(300, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent evento) {
        if (alternar) {
            contenedor.setLayout(cuadricula2);
        } else {
            contenedor.setLayout(cuadricula1);
        }
        alternar = !alternar;
// establecer alternar en el valor opuesto
        contenedor.validate();
    }

    public static void main(String[] args) {
        gridLayout aplicacion = new gridLayout();
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
