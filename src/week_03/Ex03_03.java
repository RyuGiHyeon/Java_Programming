package week_03;

import java.util.Scanner;

public class Ex03_03 {
    public static void main(String[] args) {
        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; //환산할 돈의 종류
        int[] change = new int[8];
        System.out.print("금액을 입력하세요 >>");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        scanner.close();

        for(int i=0; i<unit.length; i++){
            change[i] = money / unit[i];
            money %= unit[i];
            if(change[i] == 0){
                continue;
            }
            else {
                System.out.printf("%d원 짜리 : %d개\n", unit[i], change[i]);
            }
        }
    }
}
