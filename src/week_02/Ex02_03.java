package week_02;
import java.util.Scanner;

public class Ex02_03 {
    public static void main(String[] args) {
        double height, weight, BMI;

        Scanner scanner = new Scanner(System.in);
        System.out.print("몸무게를 입력하세요.(kg) >> ");
        weight = scanner.nextDouble();

        System.out.print("키를 입력하세요.(cm)>> ");
        height = scanner.nextDouble();

        BMI = weight / ((height / 100) * (height / 100));

        if (BMI < 19) {
            System.out.printf("BMI 지수 : %.2f, 판정 졀과 : 저체중", BMI);
        } else if (BMI >= 19 && BMI < 24) {
            System.out.printf("BMI 지수 : %.2f, 판정 졀과 : 정상", BMI);
        } else if (BMI >= 24 && BMI < 30) {
            System.out.printf("BMI 지수 : %.2f, 판정 졀과 : 과제중", BMI);
        } else {
            System.out.printf("BMI 지수 : %.2f, 판정 졀과 : 비만", BMI);
        }
        scanner.close();
    }
}
