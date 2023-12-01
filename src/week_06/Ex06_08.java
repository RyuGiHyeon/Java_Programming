package week_06;

import java.awt.*;
import javax.swing.*;
import java.lang.Math;

public class Ex06_08 extends JFrame {
    public Ex06_08(){
        super("3x3 Color Frame");
        int r, g, b;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(3, 3));
        JLabel [] label = new JLabel[9];

        for (int i=0; i<label.length; i++){
            r = (int)(Math.random()*255);
            g = (int)(Math.random()*255);
            b = (int)(Math.random()*255);

            label[i] = new JLabel(Integer.toString(i));
            label[i].setOpaque(true);
            label[i].setBackground(new Color(r, g, b));
            c.add(label[i]);
        }
        setSize(500,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex06_08();
    }
}
