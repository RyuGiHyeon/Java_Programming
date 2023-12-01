package week_09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex09_02 extends JFrame {
    private JTextField tf = new JTextField(10);
    private JComboBox<String> combo = new JComboBox<>();

    public Ex09_02() {
        super("JTextField and JComboBox Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(tf);
        c.add(combo);

        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField t = (JTextField)e.getSource();
                combo.addItem(t.getText());
            }
        });

        setSize(250,200);
        setVisible(true);
    }

    public static void main(String[] args){
        new Ex09_02();
    }
}
