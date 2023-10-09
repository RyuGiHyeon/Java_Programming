package week_03;

import java.util.Arrays;

public class Ex03_05 {
    public static void main(String[] args) {
        int[] arr = {4, 9, 39, 30, 10, 43};

        Arrays.sort(arr);

        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
