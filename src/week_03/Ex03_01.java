package week_03;

import java.util.Scanner;

public class Ex03_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[5];
        System.out.print("배열 >> ");
        for (int i=0; i<5; i++){
            array[i] = scanner.nextInt();
        }
        for (int i=0; i<5; i++){
            System.out.printf("인덱스 %d: %d\n", i, array[i]);
        }
    }
}
