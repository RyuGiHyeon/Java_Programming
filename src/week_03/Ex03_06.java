package week_03;

public class Ex03_06{
    public static void main(String[] args) {
        //4행 5열의 2차원 배열 생성
        int arr[][] = new int[5][4];
        int multiple = 0;
        //0부터 7의 배수 입력
        for (int j=0; j<4; j++){
            for (int i=0; i<5; i++){
                arr[i][j] = multiple * 7;
                multiple ++;
            }
        }
        //배열 내용 출력
        for (int j=0; j<arr[j].length; j++){
            for (int i=0; i<arr.length; i++){
                System.out.printf("%d\t", arr[i][j]);
            }
            System.out.println();
        }
    }
}