package week_03;
import java.util.Scanner;

public class Ex03_02 {
    public static void main(String[] args) {
        String course[] = {"객체지향", "프로그래밍", "알고리즘", "자료구조", "컴퓨터구조"};
        char score[] = {'A', 'B', 'B', 'C', 'D'};
        Scanner sc = new Scanner(System.in);
        int i = 0;

        while (true) {
            System.out.print("강의 이름을 입력하세요>>");
            String c = sc.next();
            i++;
            switch (c) {
                case "객체지향":
                    System.out.printf("객체지향의 학점은 %s\n", score[0]);
                    break;
                case "프로그래밍":
                    System.out.printf("프로그래밍의 학점은 %s\n", score[1]);
                    break;
                case "알고리즘":
                    System.out.printf("알고리즘의 학점은 %s\n", score[2]);
                    break;
                case "자료구조":
                    System.out.printf("자료구조의 학점은 %s\n", score[3]);
                    break;
                case "컴퓨터구조":
                    System.out.printf("컴퓨터구조의 학점은 %s\n", score[4]);
                    break;
                case "종료":
                    System.out.println("종료합니다.");
                    System.exit(0);
                default :
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }
}