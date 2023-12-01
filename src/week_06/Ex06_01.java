package week_06;

class Circle {
    public int x, y, radius;
    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public String toString(){
        return "Circle 중심 (" + x + "," + y + ")" + ", 반지름 : " + radius;
    }
    public boolean equals(Object obj){
        Circle b = (Circle)obj;
        if (x == b.x && y == b.y){
            return true;
        }
        else {
            return false;
        }
    }
}

public class Ex06_01 {

    public static void main(String[] args) {
        Circle a = new Circle(2, 10, 18);
        Circle b = new Circle(2, 10, 23);
        System.out.println("원 a >> " + a);
        System.out.println("원 b >> " + b);
        if(a.equals(b)){
            System.out.println("같은 원입니다.");
        }
        else {
            System.out.println("서로 다른 원입니다.");
        }

    }
}
