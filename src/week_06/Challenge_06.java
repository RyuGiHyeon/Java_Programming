package week_06;

import javax.swing.*;
import java.awt.*;

class SouthPanel extends JPanel{
    public SouthPanel(){
        Container a = new Container();
        a.setLayout(new FlowLayout());
        JLabel label = new JLabel("수식입력");
        label.setOpaque(true);  // JLabel에 대해 배경색 적용을 위해 추가
        label.setBackground(Color.GRAY);
        a.add(label);
        this.add(a);
//        Container a = new Container();
//        a.setLayout(new FlowLayout());
//        a.add(new JLabel("수식입력")).setBackground(Color.GRAY);
        
    }
}
class CenterPanel extends JPanel{
    public CenterPanel(){
        Container b = new Container();
        b.setLayout(new GridLayout(4, 4,5,5));
        b.add(new JButton("0"));
        b.add(new JButton("1"));
        b.add(new JButton("2"));
        b.add(new JButton("3"));
        b.add(new JButton("4"));
        b.add(new JButton("5"));
        b.add(new JButton("6"));
        b.add(new JButton("7"));
        b.add(new JButton("8"));
        b.add(new JButton("9"));
        b.add(new JButton("CE"));
        b.add(new JButton("계산"));
//        b.add(new JButton("+"));.setBackground(Color.yellow);
//        b.add(new JButton("-"));.setBackground(Color.yellow);
//        b.add(new JButton("x"));.setBackground(Color.yellow);
//        b.add(new JButton("/"));.setBackground(Color.yellow);
        JButton plusButton = new JButton("+");
        plusButton.setBackground(Color.yellow);
        b.add(plusButton);
        JButton minusButton = new JButton("-");
        minusButton.setBackground(Color.yellow);
        b.add(minusButton);
        JButton multiplyButton = new JButton("x");
        multiplyButton.setBackground(Color.yellow);
        b.add(multiplyButton);
        JButton divideButton = new JButton("/");
        divideButton.setBackground(Color.yellow);
        b.add(divideButton);
        this.add(b);
    }
}
class NorthPanel extends JPanel{
    public NorthPanel(){
        Container c = new Container();
        c.setLayout(new FlowLayout());
        //c.add(new JLabel("계산 결과")).setBackground(Color.black);
        JLabel label = new JLabel("계산 결과");
        label.setOpaque(true);  // JLabel에 대해 배경색 적용을 위해 추가
        label.setBackground(Color.black);
        label.setForeground(Color.white);
        c.add(label);
        this.add(c);
    }
}

public class Challenge_06 extends JFrame{
    public Challenge_06(){
        JFrame frame = new JFrame("계산기 프레임");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        Container d = getContentPane();
        d.setLayout(new FlowLayout());
        d.add(new SouthPanel());
        d.add(new CenterPanel());
        d.add(new NorthPanel());

        //화면에 보이도록 설정
        frame.setContentPane(d);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new Challenge_06();
    }
}
