package week_02;
import java.util.Scanner;

public class Ex02_08 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("건너뛸 숫자를 입력하세요 (1 ~ 10 사이) : ");
        int n = scanner.nextInt();

        for (count = 1; count <= 10; count++) {
            if (n != count) {
                System.out.printf("%d ", count);
            }
        }
    }
}
