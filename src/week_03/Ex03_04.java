package week_03;

import java.util.Random;

public class Ex03_04 {
    public static void main(String[] args) {
        int randary[] = new int[10];
        randary = generteRandomIntArray(10);

        for(int i=0; i<randary.length; i++){
            System.out.printf("%d ",randary[i]);
        }
    }

    public static int[] generteRandomIntArray(int length){
        int randomArray[] = new int[length];
        Random random= new Random();

        for (int i=0; i<randomArray.length; i++){
            randomArray[i] = random.nextInt(1, 101);

        }
        return randomArray;
    }
}
