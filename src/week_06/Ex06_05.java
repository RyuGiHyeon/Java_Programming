package week_06;

import java.util.*;

public class Ex06_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.print(">>");
            String str = scan.nextLine();

            if (str.equalsIgnoreCase("그만")) {
                System.out.println("종료합니다...");
                break;
            }

            StringTokenizer st = new StringTokenizer(str, " ");
            System.out.printf("어절 개수는 %d\n", st.countTokens());
        }
        scan.close();

    }
}
