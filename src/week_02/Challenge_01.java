package week_02;

import java.util.Scanner;

public class Challenge_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("현재 시간을 입력하세요 (HH 형식) : ");
        int HH = scanner.nextInt();
        System.out.print("현재 분을 입력하세요 (mm 형식) : ");
        int MM = scanner.nextInt();

        int timer, hh, mm;
        int alarm = 9 * 60;

        timer = alarm - (HH*60 + MM);

        if (HH > 24 || MM > 60){
            System.out.println("잘못된 입력입니다. 종료합니다.");
            System.exit(0);
        }

        if (timer < 0){
            timer = -timer;
            hh = timer / 60;
            mm = timer % 60;
            System.out.printf("알람이 울리기까지 %d시간 %d분 남았습니다.", hh, mm);
        }
        else if (timer > 0){
            hh = timer / 60;
            mm = timer % 60;
            System.out.printf("알람이 울리고 %d시간 %d분 지났습니다.", hh, mm);
        }
        else {
            System.out.println("9시 정각입니다..");
        }
    }
}
