package first;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Impot extends JFrame  implements ActionListener{
    private JLabel namLabel;
    private JTextField searchField;
    private JButton buttonOk;
    private JTextArea resultatField;
    private JButton buttonClear;

    public Impot(){
        this.setSize(500, 400);
        this.setTitle("Generateur Import");
        this.setVisible(true);

        // creation d'un pano
        JPanel pan1 = new JPanel(new FlowLayout());
        this.namLabel = new JLabel("Texte");
        this.searchField = new JTextField(30);
        this.buttonOk = new JButton("OK");
        pan1.add(this.namLabel);
        pan1.add(this.searchField);
        pan1.add(this.buttonOk);


        // creation du deuxieme pano
        JPanel pano2 = new JPanel(new BorderLayout());
        this.resultatField = new JTextArea(20, 45);
        this.buttonClear = new JButton("Clear");
        pano2.add(this.resultatField, BorderLayout.CENTER);
        pano2.add(this.buttonClear, BorderLayout.SOUTH);


        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());
        c.add(pan1);
        c.add(pano2);

        this.buttonOk.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println("hello World");
        String text = this.searchField.getText();
        this.resultatField.append(text+"\n");
        this.searchField.setText("");
    }

}

// class DestinataireAction implements ActionListener{

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         System.out.println("hello World");
//     }
    
// }