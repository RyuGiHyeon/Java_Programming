package week_04;

import java.util.Scanner;

public class Ex04_01 {      //Ex04_01은
    private double math;
    private double science;
    private double english;

    public Ex04_01(double math, double science, double english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }

    public double average() {
        return (math + science + english) / 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("객체지향, 인공지능, 알고리즘 순으로 3개의 학점 입력 >> ");
        double math = scanner.nextDouble();
        double science = scanner.nextDouble();
        double english = scanner.nextDouble();
        Ex04_01 me = new Ex04_01(math, science, english);
        System.out.printf("평균은 %.2f", me.average());
        scanner.close();
    }
}