package week_10;

import javax.swing.*;
import java.awt.*;

public class Ex10_03 extends JFrame {
    public Ex10_03(){
        super("오륜기 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new Ex10_03.testPanel());
        setSize(215, 238);
        setVisible(true);
    }

    class testPanel extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);

            int[] ax = {100, 0, 100, 200};
            int[] ay = {0, 100, 200, 100};
            int[] bx = {100, 50, 150};
            int[] by = {30, 150, 150};

            g.setColor(Color.YELLOW);
            g.drawPolygon(ax, ay, 4);
            g.setColor(Color.GRAY);
            g.drawOval(25, 25, 150, 150);
            g.setColor(Color.BLACK);
            g.drawOval(30, 30, 140, 140);
            g.setColor(Color.RED);
            g.drawPolygon(bx, by, 3);
        }
    }

    public static void main(String[] args) {
        new Ex10_03();
    }
}