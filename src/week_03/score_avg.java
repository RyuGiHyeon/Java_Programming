package week_03;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class score_avg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       //입력
        Random random = new Random();                   //랜덤
        int winningCount = 0;                           //당첨번호 개수
        String res;                                     //당첨결과

        int winningNumbers[] = new int[6];              //당첨번호 배열
        boolean[] usedNumbers = new boolean[46];
        int userNumbers[] = new int[6];                 //사용자번호 배열
        boolean[] scannedNumbers = new boolean[46];

        ///////////////////////////////////////////
        //로또 당첨번호 6개 생성
        for (int j = 0; j < 6; j++) {
            int randnum;
            do {
                randnum = random.nextInt(1, 46);
            } while (usedNumbers[randnum]);
            usedNumbers[randnum] = true;
            winningNumbers[j] = randnum;
        }
        Arrays.sort(winningNumbers);
        /////////////////////////////////////////////
        //사용자로 부터 중복되지 않는 6개 숫자 받기
        for (int i=0; i<6; i++){
            System.out.print("로또번호를 입력하세요 (1~45 사이의 숫자, 중복없이) : ");
            int inputNum = scanner.nextInt();

            //입력 루프 생성(잘못된 입력,중복 제거)
            if((inputNum >= 46) || (inputNum <= 0)){
                System.out.println("잘못된 범위의 숫자입니다.");
                i--;
            }
            else if (scannedNumbers[inputNum]){
                System.out.println("중복된 숫자입니다.");
                i--;
            }
            else {
                scannedNumbers[inputNum] = true;
                userNumbers[i] = inputNum;
            }
        }
        //로또 번호 출력
        System.out.println("당첨 번호 : " + Arrays.toString(winningNumbers));
        System.out.println("사용자 번호 : " + Arrays.toString(userNumbers));

        //로또 등수 판별
        for (int i=1; i<46; i++){
            if ((usedNumbers[i]) && (scannedNumbers[i])){
                winningCount++;
            }
        }

        //간단화한 스위치문
        res = switch (winningCount) {
            case 0, 1, 2 -> "꽝";
            case 3 -> "4등";
            case 4 -> "3등";
            case 5 -> "2등";
            case 6 -> "1등";
            default -> "잘못된 입력입니다. 프로그램을 종료합니다.";
        };
        System.out.printf("%s입니다. 일치하는 번호가 %d개 입니다.", res, winningCount);
    }
}
