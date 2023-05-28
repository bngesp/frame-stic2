package first;

import javax.swing.*;

import java.awt.*;

public class FlowFrame extends JFrame {
    
    public FlowFrame(){

        this.setVisible(true);
        this.setSize(500, 150);
        this.setTitle("My FlowLayout Exemple");
        JPanel pan = new JPanel();
        Container c = this.getContentPane();
        FlowLayout f = new FlowLayout();
        f.setHgap(20);
        f.setVgap(50);
        c.setLayout(f);
        
        for (int i = 0; i < 10; i++) {
            pan.add(new JButton(" boutton "+i));
        }

        pan.add(new JLabel("my text"));//, FlowLayout.CENTER);

        this.add(pan);

    }

}
