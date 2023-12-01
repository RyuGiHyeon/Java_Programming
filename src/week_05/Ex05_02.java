package week_05;

public class Ex05_02 extends Ex05_01 {
    private String ip;
    public Ex05_02(String ip, int size, int nColors){
        super(size, nColors);
        this.ip = ip;
    }
    public void printProperty(){
        System.out.print("나의 IPTV는 " + ip + " 주소의 ");
        System.out.print("TV 속성 : ");
        System.out.println(getSize() + "인치 / " + nColors + "해상도");
    }

    public static void main(String[] args) {
        //192.1.1.2 주소에 32인치, 2048 해상도
        Ex05_02 iptv = new Ex05_02("192.1.1.2", 32, 2048);
        iptv.printProperty();
    }
}
