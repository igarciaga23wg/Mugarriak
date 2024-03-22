import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame implements ItemListener {
    private JComboBox<String> comboBox;

    public Main() {
        setLayout(null);
        comboBox = new JComboBox<String>();
        comboBox.setBounds(30, 10, 300, 20);
        add(comboBox);
        comboBox.addItem("python.txt");
        comboBox.addItem("c.txt");
        comboBox.addItem("java.txt");
        comboBox.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) { 
        if (e.getSource() == comboBox) {
            String aukeratuta = (String) comboBox.getSelectedItem();
            setTitle(aukeratuta);
        }
    }

    public static void main(String[] args) {
        Main m1 = new Main();
        m1.setBounds(0, 0, 200, 150);
        m1.setVisible(true);
        m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
