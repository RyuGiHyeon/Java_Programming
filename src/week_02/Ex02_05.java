package week_02;
import java.util.Scanner;

public class Ex02_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("연산식을 입력하세요 >> ");
        int op1 = scanner.nextInt();
        String op = scanner.next();
        int op2 = scanner.nextInt();
        double res = 0;

        switch (op){
            case "+":
                res = op1 + op2;
                break;
            case "-":
                res = op1 - op2;
                break;
            case "*":
                res = op1 * op2;
                break;
            case "/":
                res = (double)op1 / (double)op2;
                break;
            default :
                System.out.println("잘못된 입력입니다.");
                break;
        }
        System.out.printf("%d %s %d의 계산 결과는 %.2f",op1,op,op2,res);

        scanner.close();
    }
}
