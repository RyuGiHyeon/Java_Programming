package week_04;

public class Ex04_03 {
    public int x, y, width, height;
    public Ex04_03(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    //사각형의 넓이
    int square(){
        return width * height;
    }
    //사각형의 좌표와 넓이를 화면에 출력
    void show(){
        System.out.printf("(%d. %d) 에서 크기가 %dx%d인 사각형", x, y, width, height);
    }

    //매개변수로 받은 r이 현재 사각형 안에 있느면 return true
    boolean contains(Ex04_03 r) {
        if ((x < r.x && y < r.y) &&
                (x + width > r.x + r.width) &&
                (y + height > r.y+r.height)){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String args[]) {
        Ex04_03 r = new Ex04_03(3, 3, 9, 7);
        Ex04_03 s = new Ex04_03(5, 5, 6, 6);
        Ex04_03 t = new Ex04_03(4, 4, 10, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
    }
}
