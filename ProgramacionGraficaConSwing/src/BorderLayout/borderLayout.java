package BorderLayout;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class borderLayout {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("BorderLayoutTest");
        f.setLayout(new BorderLayout());

        JButton b1 = new JButton("Button 1 (NORTH)");
        f.add(b1, BorderLayout.NORTH);

        JButton b2 = new JButton("Button 2 (WEST)");
        f.add(b2, BorderLayout.WEST);

        JButton b3 = new JButton("Button 3 (CENTER)");
        f.add(b3, BorderLayout.CENTER);

        JButton b4 = new JButton("Button 4 (EAST)");
        f.add(b4, BorderLayout.EAST);

        JButton b5 = new JButton("Button 5 (SOUTH)");
        f.add(b5, BorderLayout.SOUTH);

        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
