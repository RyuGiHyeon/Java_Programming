package week_02;
import java.util.Scanner;

public class Ex02_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("짝수입니다.");
        }
        else {
            System.out.println("홀수입니다.");
        }
    }
}
