package week_06;

class Shape {
    public void draw(){
        System.out.println("Shape");{
        }
    }
}
class Rectangle extends Shape{
    public void draw(){
        System.out.println("Circle");
    }
}
public class Ex06_02 {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        shape.draw();
    }
}
