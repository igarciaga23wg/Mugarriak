import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main extends JFrame implements ItemListener {
    private JComboBox<String> comboBox;
    private JTextArea textArea;

    private JTextField textfield;

    private JScrollPane scrollpane;

    public Main() {
        setLayout(new BorderLayout());
        comboBox = new JComboBox<String>();
        comboBox.setBounds(30, 10, 300, 20);
        add(comboBox);
        comboBox.addItem("python.txt");
        comboBox.addItem("c.txt");
        comboBox.addItem("java.txt");
        comboBox.addItemListener(this);


        JButton garbitubotoia = new JButton("Clear");
        garbitubotoia.setBounds(340,10,100,20);
        add(garbitubotoia);

        JButton itxibotoia = new JButton("Close");
        itxibotoia.setBounds(640,360,100,20);
        add(itxibotoia);


        textfield=new JTextField();
        textfield.setBounds(600,10,350,350);
        add(textfield);
        textArea=new JTextArea();



        scrollpane=new JScrollPane(textArea);
        scrollpane.setBounds(10,50,400,300);
        scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(scrollpane);

        garbitubotoia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });
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
        m1.setBounds(0, 0, 1000, 500);
        m1.setVisible(true);
        m1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
