package week_06;

import java.awt.*;
import javax.swing.*;

public class Ex06_07 extends JFrame {
    public Ex06_07 () {
        super("BoarderLayout Practice"); //setTitle("BoarderLayout Practice)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout(5, 7));
        c.add(new JButton("East"), BorderLayout.EAST);
        c.add(new JButton("West"), BorderLayout.WEST);
        c.add(new JButton("North"), BorderLayout.NORTH);
        c.add(new JButton("South"), BorderLayout.SOUTH);
        c.add(new JButton("Center"), BorderLayout.CENTER);
        setSize(400,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex06_07();
    }
}
