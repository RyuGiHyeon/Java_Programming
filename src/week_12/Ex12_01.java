package week_12;

import java.util.Scanner;

abstract class Converter {
    abstract protected double convert(double src);
    abstract protected String srcString();
    abstract protected String destString();
    protected double ratio;

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(srcString() + "을 " + destString() + "로 바꿉니다.");
        System.out.print(srcString() + "을 입력하세요>> ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.println("반환 결과: " + res + destString() + "입니다.");
        scanner.close();
    }
}

class Ex12_01 extends Converter {
    public Ex12_01(double ratio) {
        this.ratio = ratio;
    }

    protected double convert(double src) {
        return src/ratio;
    }

    protected String srcString(){
        return "원";
    }

    protected String destString() {
        return "달러";
    }

    public static void main(String[] args) {
        Ex12_01 toDollar = new Ex12_01(1200);
        toDollar.run();
    }
}