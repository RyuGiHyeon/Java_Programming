package week_06;

import javax.swing.*;
import java.awt.*;

//내가 만든것.
class NorthPanel extends JPanel{
    public NorthPanel(){
        JLabel label = new JLabel("수식입력");
        label.setLayout(new FlowLayout());      //JPanel이 디폴트로 FlowLayout이지만, 확실하게 하기 위해

        //색깔 적용
        label.setOpaque(true);  // label에 배경색 적용
        label.setBackground(Color.LIGHT_GRAY);
        label.setForeground(Color.BLACK);       //Default = black 이지만 확실하게

        JTextField textField = new JTextField("                                    ");

        this.add(label);
        this.add(textField);
    }
}

class CenterPanel extends JPanel{
    public CenterPanel(){
        //GridLayout 배치 관리자
        String[] cal = {"0", "1", "2", "3",
                "4", "5", "6", "7",
                "8", "9", "CE", "계산",
                "+", "-", "*", "/"};

        Container c = new Container();
        c.setLayout(new GridLayout(4, 4,5,5));

        JButton[] label = new JButton[16];
        for (int i=0; i<16; i++){
            label[i] = new JButton(cal[i]);
            label[i].setOpaque(true);
            if (i < 12){
                label[i].setForeground(Color.cyan);
            }
            else {
                label[i].setForeground(Color.yellow);
            }
            c.add(label[i]);
        }
        this.add(c);
    }
}

class SouthPanel extends JPanel{
    public SouthPanel(){
        JLabel label = new JLabel("계산 결과");
        label.setLayout(new FlowLayout());    //JPanel이 디폴트로 FlowLayout이지만, 확실하게 하기 위해

        label.setOpaque(true);  // label에 배경색 적용
        label.setBackground(Color.DARK_GRAY);
        label.setForeground(Color.WHITE);
        JTextField textField = new JTextField("                                    ");

        this.add(label);
        this.add(textField);
    }
}


public class Challenge_06 extends JFrame{
    public Challenge_06(){
        JFrame frame = new JFrame("계산기 프레임");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(330, 240);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());  //컨텐트 팬은 디폴트로 BorderLayout 배치 관리자.

        NorthPanel north = new NorthPanel();
        CenterPanel center = new CenterPanel();
        SouthPanel south = new SouthPanel();

        north.setBackground(Color.LIGHT_GRAY);
        south.setBackground(Color.DARK_GRAY);

        c.add(north, BorderLayout.NORTH);
        c.add(center, BorderLayout.CENTER);
        c.add(south, BorderLayout.SOUTH);

        frame.setContentPane(c);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new Challenge_06();
    }
}
