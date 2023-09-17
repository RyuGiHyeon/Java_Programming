package week_02;
import java.util.Scanner;

public class Ex02_02 {
    public static void main(String[] args) {

        int A, B;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();


        if(A > B) {
            System.out.println(">");
        }
        else if(A < B) {
            System.out.println("<");
        }
        else {
            System.out.println("==");
        }
    }
}
