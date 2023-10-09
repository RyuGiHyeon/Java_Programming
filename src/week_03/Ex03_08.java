package week_03;

import java.util.Arrays;
import java.util.Random;

public class Ex03_08 {
    public static void main(String[] args) {
        int lotto[] = new int[6];
        Random random = new Random();
        char a = 'A';

        //중복방지하기 위한 배열 루프
        for (int i = 0; i < 5; i++) {
            boolean[] usedNumbers = new boolean[46];

            for (int j = 0; j < 6; j++) {
                int randnum;
                do {
                    randnum = random.nextInt(1, 46);
                } while (usedNumbers[randnum]);
                usedNumbers[randnum] = true;
                lotto[j] = randnum;
            }
            Arrays.sort(lotto);
            System.out.println(a + "자동 : " + Arrays.toString(lotto));
            a++;
        }
    }
}
