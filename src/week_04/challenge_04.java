package week_04;


import java.util.Scanner;

class MovieTheater{
    public int numRows, numCols;
//    private String phone;
//    private String name;
    //좌석 배열
    char[][] seat;
    //예약정보 저장 배열
    String[][] reserve_name;
    String[][] reserve_phone;


    public MovieTheater(int numRows, int numCols){
        this.numRows = numRows;
        this.numCols = numCols;
        seat = new char[numRows][numCols];
        reserve_name = new String[numRows][numCols];
        reserve_phone = new String[numRows][numCols];



        // 좌석을 초기화하고 빈 좌석으로 설정
        for(int i=0; i<numRows; i++){       //수정해야함
            for(int j=0; j<10; j++){      //수정해야함
                seat[i][j] = '□';
            }
        }
    }

    public void displaySeat(){
        StringBuffer stringbuffer = new StringBuffer();
        String col_info = "  1 2 3 4 5 6 7 8 9 10";

        stringbuffer.append(col_info);
        stringbuffer.append('\n');
        for(int i=0; i<numRows; i++){
            stringbuffer.append((char)(i+65));
            stringbuffer.append(' ');
            for(int j=0; j<numRows; j++){
                stringbuffer.append(seat[i][j]);
                stringbuffer.append(' ');
            }
            stringbuffer.append('\n');
        }
        System.out.println(stringbuffer);
    }

    public boolean reserveSeat(int row, int col, String name, String phoneNumber){
        //예약 하는 메소드 - true 리턴되는 경우는 예약 성공, false는 예약 실패
        if (seat[row][col] == '□'){ //빈자리라면 예약 가능, 좌석에 따른 이름과 휴대폰 번호 저장
            seat[row][col] = '■';
            reserve_name[row][col] = name;
            reserve_phone[row][col] = phoneNumber;
            return true;
        }
        else {
            return false;
        }
    }

    public void cancelReservation(int row, int col){
        if (seat[row][col] != '□'){
            seat[row][col] = '□';
            reserve_name[row][col] = null;
            reserve_phone[row][col] = null;
            System.out.println("좌석 예약 취소가 완료되었습니다.");
        }
        else {
            System.out.println("예약되지 않은 좌석입니다.");
        }
    }

    public boolean displayReservationInfo(String name){
        //예약 정보 조회 메소드
        for(int i=0; numRows>i; i++){
            for(int j=0; numCols>j; j++){
                if(reserve_name[i][j] != null && reserve_name[i][j].equals(name)){  //null 조건문 추가
                    System.out.println("예약정보 >>");
//                    System.out.printf("좌석 : %s", );
                    System.out.printf("이름 : %s\n", reserve_name[i][j]);
                    System.out.printf("전화번호 : %s\n", reserve_phone[i][j]);
                    return true;
                }
            }
        }
        return false;
    }
}

public class challenge_04 {
    public static void main(String[] args) {
        int numRows = 10;
        int numCols = 10;

        Scanner scanner = new Scanner(System.in);
        int instruction;
        String seat_num;
        String name;
        String phone_num;
        int res_row, res_col;   //행 열

        MovieTheater movieTheather = new MovieTheater(numRows, numCols);
        //while(true)를 사용하여 예약 시스템 사용자 입력을 구현
        while (true) {
            System.out.println("1. 좌석 조회");
            System.out.println("2. 좌석 예약");
            System.out.println("3. 좌석 예약 취소");
            System.out.println("4. 예약 정보 조회");
            System.out.println("5. 종료");
            System.out.print("원하는 작업을 선택하세요 (1/2/3/4/5): ");
            instruction = scanner.nextInt();


            switch (instruction) {
                case 1:
                    movieTheather.displaySeat();
                    break;
                case 2:
                    System.out.print("좌석을 예약하려면 행(A, B, C, ...)과 열(1, 2, 3, ...)을 입력하세요. (예 : A2): ");
                    seat_num = scanner.next();
                    res_row = (int)seat_num.charAt(0)-'A';        //문자를 아스키코드르 통해 정수로 변환
                    res_col = (int)seat_num.charAt(1)-48-1;

                    System.out.print("이름을 입력하세요 :");
                    name = scanner.next();

                    System.out.print("전화번호를 입력하세요 : ");
                    phone_num = scanner.next();

                    if (movieTheather.reserveSeat(res_row, res_col, name, phone_num)){
                        System.out.println("좌석 예약이 완료되었습니다.");
                    }
                    else {
                        System.out.println("좌석 예약이 안 되었습니다.");
                    }
                    break;
                case 3:
                    System.out.print("예약을 취소할 좌석을 입력하세요 (예 : A2): ");
                    seat_num = scanner.next();
                    res_row = seat_num.charAt(0)-'A';        //문자를 아스키코드를 통해 정수로 변환
                    res_col = seat_num.charAt(1)-48-1;

                    movieTheather.cancelReservation(res_row, res_col);
                    break;
                case 4:
                    System.out.print("예약 정보를 조회할 이름을 입력하세요: ");
                    name = scanner.next();

                    if (!movieTheather.displayReservationInfo(name)){
                        System.out.println("예약되지 않은 이름입니다.");
                    }
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("유효하지 않은 선택입니다. 다시 선택하세요.");
                    break;
            }
        }
    }
}