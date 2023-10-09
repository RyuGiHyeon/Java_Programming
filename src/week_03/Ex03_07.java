package week_03;

public class Ex03_07 {
    public static void main(String[] args) {
        int sum = 0;
        if(args.length == 0){
            System.out.println("명령행 인자가 없습니다.");
            return;
        }
        else{
            for (int i = 0; i < args.length; i++) {
                sum += Integer.parseInt(args[i]);
            }
        }
        System.out.println(sum/args.length);
    }
}
