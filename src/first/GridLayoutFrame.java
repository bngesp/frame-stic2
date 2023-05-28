package first;

import javax.swing.*;

import java.awt.*;;

public class GridLayoutFrame extends JFrame {

    public GridLayoutFrame(){
        this.setVisible(true);
        this.setSize(500, 150);
        this.setTitle("my GridLayout exemple");

        JTextField textField = new JTextField(10);
        JPanel pText = new JPanel();
        pText.add(new JLabel("un texte"));
        pText.add(textField);
        JPanel p = new JPanel( new GridLayout(4,4));
        p.add(new JButton("7"));
        p.add(new JButton("8"));
        p.add(new JButton("9"));
        p.add(new JButton("X"));
        p.add(new JButton("4"));
        p.add(new JButton("5"));
        p.add(new JButton("6"));
        p.add(new JButton("-"));
        p.add(new JButton("1"));
        p.add(new JButton("2"));
        p.add(new JButton("3"));
        p.add(new JButton("+"));
        p.add(new JButton("0"));
        p.add(new JButton(","));
        p.add(new JButton("/"));
        p.add(new JButton("="));
        this.add(pText);
        this.add(p);
    }
}
