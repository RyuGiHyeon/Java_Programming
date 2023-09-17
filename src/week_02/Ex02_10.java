package week_02;
import java.util.Scanner;

public class Ex02_10 {
    public static void main(String[] args) {
        int i, j = 0;
        Scanner scanner = new Scanner(System.in);

        for (i = 1; i < 10; i++) {
            for (j = 9; j > 0; j--) {
                System.out.printf("%d X %d = %d\t", j, i, j * i);
            }
            System.out.println();
        }
    }
}
