package week_04;

public class Ex04_02 {
    private int x;
    private int y;

    Ex04_02(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Ex04_02() {
        this(0, 0);
    }
    void print() {
        System.out.println("x: " + x + ", y: " + y);
    }
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ex04_02 p1 = new Ex04_02(25, 50);
        Ex04_02 p2 = new Ex04_02();

        p1.print();
        p2.print();

        p2.move(30, 40);
        p2.print();
    }
}
