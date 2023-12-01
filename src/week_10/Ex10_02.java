package week_10;

import javax.swing.*;
import java.awt.*;

public class Ex10_02 extends JFrame {
    public Ex10_02(){
        super("오륜기 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new Ex10_02.testPanel());
        setSize(400, 400);
        setVisible(true);
    }

    class testPanel extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);

            g.setColor(Color.BLUE);
            g.drawOval(30, 100, 100, 100);
            g.setColor(Color.YELLOW);
            g.drawOval(86, 170, 100, 100);
            g.setColor(Color.BLACK);
            g.drawOval(140, 100, 100, 100);
            g.setColor(Color.GREEN);
            g.drawOval(196, 170, 100, 100);
            g.setColor(Color.RED);
            g.drawOval(250, 100, 100, 100);
        }
    }

    public static void main(String[] args) {
        new Ex10_02();
    }
}
