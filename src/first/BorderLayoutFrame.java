package first;

import javax.swing.*;

import java.awt.*;

public class BorderLayoutFrame extends JFrame{

    public BorderLayoutFrame(){
        this.setVisible(true);
        this.setSize(500, 50);
        this.setTitle("my BorderLayout exemple");
        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());
        
        JPanel pano1 = new JPanel(new BorderLayout()); // par defeaut : flowlayout
        pano1.add(new JLabel("My text for example"), BorderLayout.NORTH);
        pano1.add(new JTextField(), BorderLayout.CENTER);

        JPanel pano2 = new JPanel();
        pano2.add(new JButton("doubler"));
        pano2.add(new JButton("Fin"));
        
        pano1.add(pano2, BorderLayout.SOUTH);

        this.add(pano1);

    }
    
}
