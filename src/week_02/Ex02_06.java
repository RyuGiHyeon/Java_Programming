package week_02;

public class Ex02_06 {
    public static void main(String[] args) {
        int count, sum = 0;
        for(count=1; count<=10; count++) {
            sum += count;
            System.out.printf("%d ", count);
        }
        System.out.println();
        System.out.printf("sum = %d\n", sum);
    }
}
