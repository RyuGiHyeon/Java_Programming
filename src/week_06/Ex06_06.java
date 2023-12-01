package week_06;

import javax.swing.*;
public class Ex06_06 extends JFrame{
    public Ex06_06(String title){
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex06_06("Let's study Java");
    }
}
