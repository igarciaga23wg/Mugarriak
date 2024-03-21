import javax.swing.*;
import java.awt.event.*;
public class Main extends JFrame{
        private JComboBox<String> comboBox;
        public Main()
        {
            setLayout(null);
            comboBox=new JComboBox<String>();
            comboBox.setBounds(10,10,80,20);
            add(comboBox);
            comboBox.addItem("python.txt");
            comboBox.addItem("c.txt");
            comboBox.addItem("java.txt");
            comboBox.addItemListener((ItemListener) this);

        }
        public void itemStateaChanged(ItemEvent e)
        {
            if (e.getSource()==comboBox)
            {
                String aukeratuta = (String) comboBox.getSelectedItem();
                setTitle(aukeratuta);
            }
        }
    public static void main(String[] args) {
            Main m1 = new Main();
            m1.setBounds(0,0,200,150);
            m1.setVisible(true);
            m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}