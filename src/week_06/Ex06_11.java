package week_06;

import javax.swing.*;

public class Ex06_11 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWorld GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton button = new JButton("Click Me!");
        button.addActionListener(e->{
            JOptionPane.showMessageDialog(null, "Hello, World!");

        });

        frame.add(button);
        frame.setVisible(true);
    }
}
