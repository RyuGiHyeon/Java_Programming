package week_04;

import java.util.Scanner;

class Phone {
    private String name;
    private String tel;
    public Phone (String name, String tel){
        this.name = name;
        this.tel = tel;
    }
    public String getName(){
        return name;
    }
    public String getTel(){
        return tel;
    }
}

public class PhoneBook {
    public int n;   //n을 모든 구간에서 사용
    Phone phone[] = new Phone[n];
    public Scanner scanner;

    public PhoneBook(){
        this.scanner = new Scanner(System.in);
    }

    void read(){
        System.out.print("연락처를 저장할 인원수를 입력하세요 : ");
        n = scanner.nextInt();
        System.out.println();
        for (int i = 0; i< n; i++){
            System.out.print("이름과 전화번호 (이름과 번호는 빈 칸 없이 입력) : ");
            String name = scanner.next();
            String tel = scanner.next();
            phone[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");   //오류 배제
    }

    String search(String name){
        for(int i=0; phone.length>i; i++) {
            if (phone[i].getName().equals(name)) {
                return phone[i].getTel();
            }
        }
        return null;
    }

    void run(){
        read();
        System.out.println(n);

        String search_name;
        while (true){
            System.out.print("검색할 이름을 입력해주세요. : ");
            search_name = scanner.nextLine();
            if (search_name.equals("종료")){
                break;
            }
            String search_tel = search(search_name);
            System.out.printf("%s의 번호는 %s입니다.", search_name, search_tel);
        }
    }

    public static void main(String[] args) {
        new PhoneBook().run();
    }
}
