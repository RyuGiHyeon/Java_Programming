package week_04;

import java.util.Scanner;

class Circle{
    public double x, y;
    public int radius;

    public Circle(double x, double y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void show(){
        System.out.printf("(%.1f, %.1f) %d", x, y, radius);
    }
    public double getArea(){
        return Math.PI*radius;  //Math.PI = 3.14
    }
}
public class Ex04_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle[] = new Circle[3];
        for (int i = 0; i< circle.length; i++){
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            circle[i] = new Circle(x, y, radius);
        }

        int max = 0;
        for (int i=0; i<circle.length; i++) {
            if (circle[max].getArea() < circle[i].getArea()) {
                max = i;
            }
        }

        System.out.println("가장 면적이 큰 원은 ");
        circle[max].show();
        scanner.close();




        /*
        System.out.print("x, y, radius >>");
        Circle a = new Circle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextInt());
        System.out.print("x, y, radius >>");
        Circle b = new Circle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextInt());
        System.out.print("x, y, radius >>");
        Circle c = new Circle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextInt());

        scanner.close();

        if (a.radius >= b.radius || a.radius >= c.radius) {
            maxcircle = 'a';
            System.out.printf("가장 큰 원은 (%d,%d)%d", a.x, a.y, a.radius);
        }
        else if (a.radius < b.radius || b.radius >= c.radius){
            maxcircle = 'b';
            System.out.printf("가장 큰 원은 (%d,%d)%d", b.x, b.y, b.radius);
        }
        else if (b.radius < c.radius || c.radius >= a.radius){
            maxcircle = 'c';
            System.out.printf("가장 큰 원은 (%d,%d)%d", c.x, c.y, c.radius);
        }*/

    }
}
