package week_04;

class Shape {
    public void draw(int x, int y) {
        System.out.printf("x : %d, y : %d\n", x, y);
    }

    public void draw(int x, int y, int width, int height) {
        System.out.printf("x : %d, y : %d, width : %d, height : %d\n", x, y, width, height);
    }

    public void draw(String color) {
        System.out.printf("color :  %s\n", color);
    }

    public void draw(String color, int x, int y) {
        System.out.printf("color :  %s, x : %d, y : %d\n", color, x, y);
    }

    public void draw(String color, int x, int y, int width, int height) {
        System.out.printf("color :  %s, x : %d, y : %d, width : %d, height : %d\n", color, x, y, width, height);
    }
}
public class Ex04_04 {
    public static void main(String[] args) {
        Shape shape = new Shape();

        shape.draw(10,20);
        shape.draw(10,20, 50, 100);
        shape.draw("red");
        shape.draw("red", 10, 20);
        shape.draw("red", 10, 20, 50, 100);
    }
}
