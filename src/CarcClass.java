
class Car{
    String color;
    int speed;

    void upspeed(int value){
        speed += value;
    }

    void downspeed(int value){
        speed -= value;
    }
}

public class CarcClass {
    public static void main(String[] args) {
        Car myCar1 = new Car();
        myCar1.color = "빨강";
        myCar1.speed = 0;

        Car myCar2 = new Car();
        myCar2.color = "초록";
        myCar2.speed = 0;

        myCar1.upspeed(30);
        System.out.println("자동차 1의 색상은 "+ myCar1.color + "이며, 현재 속도는 " + myCar1.speed + "입니다.");
    }
}
