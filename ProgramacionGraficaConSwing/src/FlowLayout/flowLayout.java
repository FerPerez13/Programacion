
package FlowLayout;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class flowLayout {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Flow Layout");
        f.setSize(500,150);
        f.setLayout(new FlowLayout(FlowLayout.RIGHT, 20,40));
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        
        f.add(b1);
        f.add(b2);
        f.add(b3);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
