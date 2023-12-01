package week_06;

import java.util.Scanner;

public class Ex06_04 {
    public static void main(String[] args) {
        System.out.print(">>");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuffer sb = new StringBuffer(text);

        while(true) {
            System.out.print("명령: ");
            String strs = scanner.nextLine();
            if (strs.equalsIgnoreCase("그만")) {
                System.out.println("종료합니다.");
                break;
            }

            String[] str = strs.split("!");
            if (str.length < 2) {
                System.out.println("잘못된 명령입니다!");
                continue;
            }
            sb.replace(0, str[0].length(), str[1]);
            System.out.println(sb);
        }

        scanner.close();
    }
}
