package week_04;

import java.util.Scanner;

public class Ex04_07 {
    public static void data_call(int a, int b) {
        a = a * 10;
        b = b * 10;
        System.out.println("Call을 수행한 변수의 값 : num = " + a + ", num2 = " + b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번재 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요. ");
        int num2 = scanner.nextInt();
        System.out.println("Call 이전 변수 값 : num = " + num1 + ", num2 = " + num2);
        data_call(num1, num2);
        System.out.println("Call 이후의 변수 값 : num = " + num1 + ", num2 = " + num2);
        scanner.close();
    }
}
