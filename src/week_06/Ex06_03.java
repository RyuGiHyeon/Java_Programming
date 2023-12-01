package week_06;

import java.util.Scanner;

public class Ex06_03 {
    public static void main(String[] args) {
        System.out.println("문자열을 입력하세요. 빈 칸이나 있어도 되고 영어 한글 모두 됩니다.");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(0);
            text = text.substring(1);
            text = text + ch;
            /*for (int j = 0; j < text.length(); j++) {
                System.out.print(text.charAt(j));
            }*/
            System.out.println(text);   //추가
            //System.out.println();
        }

        scanner.close();
    }
}
