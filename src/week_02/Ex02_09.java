package week_02;
import java.util.Scanner;

public class Ex02_09 {
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("숫자를 입력하세요 : ");
            int n = scanner.nextInt();
            i++;
            System.out.printf("입력한 숫자 : %d \n", n);
            if (n == 10) {
                break;
            }
        }
        System.out.print("프로그램을 종료합니다.");
    }
}
