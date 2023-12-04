package week_10;


import javax.swing.*;
import java.awt.*;

public class Challenge_10 extends JFrame {

    private MyPanel panel = new MyPanel();
    public Challenge_10(){
        setTitle("그래픽 이미지 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        setSize(900, 540);

        Container c = getContentPane();
        c.setLayout(new BorderLayout(10, 20));
        c.add(new MyPanel(), BorderLayout.CENTER);
        c.add(new TitlePanel(), BorderLayout.SOUTH);

        setVisible(true);
    }

    class MyPanel extends JPanel{
        private final ImageIcon icon = new ImageIcon("/Users/hyeon/Library/Mobile Documents/com~apple~CloudDocs/학교/2-2 류기현/객체지향프로그래밍/Java_Programming/src/week_10/산리오.jpg");
        private Image img = icon.getImage();
        public void paintComponent(Graphics g){
            super.paintComponent(g);

            int resrows = 3;
            int rescols = 4;

            int imgWidth = img.getWidth(this) / rescols;
            int imgHeight = img.getHeight(this) / resrows;

            int marginX = 10;
            int marginY = 10;

            for (int row = 0; row < resrows; row++) {
                for (int col = 0; col < rescols; col++) {
                    int x = col * (imgWidth + marginX); // 10픽셀 간격
                    int y = row * (imgHeight + marginY);

                    g.drawImage(img, x, y, x + imgWidth, y + imgHeight, col * imgWidth, row * imgHeight,
                            (col + 1) * imgWidth, (row + 1) * imgHeight, this);
                }
            }
        }
    }

    private static class TitlePanel extends JPanel{
        final JLabel titleLabel;
        public TitlePanel(){
            titleLabel = new JLabel("SANRIO CHARACTERS");
            add(titleLabel);

        }
    }

    public static void main(String[] args) {
        new Challenge_10();
    }

}
