package first;

import javax.swing.*;

public class SecondFrame extends JFrame {
    
    public SecondFrame() {
        this.setTitle("my first frame");
        // creation des composants
        JLabel label = new JLabel("MyName");
        JTextField textField = new JTextField(20);
        JButton connexion = new JButton("Connexion");
        JTextArea textArea = new JTextArea(10, 20);
        JLabel label2 = new JLabel("Vos informations");
        JCheckBox checkBox = new JCheckBox("connexion automatique");

        // ajout des composants
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(label2);
        panel.add(textArea);
        panel.add(checkBox);
        panel.add(connexion);

        this.add(panel);
        this.setSize(500,200);
        this.setVisible(true);
    }
}
