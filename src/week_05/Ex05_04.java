package week_05;

//부모 클래스
class Parent{
    String name;

    //부모클래스 생성자
    public Parent(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("부모클래스 생정자 호출 : " + name);
        System.out.println("부모클래스 display 메소드 호출 : " + name);
    }
}

//자식클래스
class Child extends Parent{
    int age;

    //자식 클래스 생성자
    public Child(String name, int age){
        super(name);
        this.age = age;
    }


    //오버라이딩된 display 메소드
    public void display(){
        System.out.println("자식 클래스 생성자 호출 : " + name + ", " + age);
        System.out.println("자식 클래스 display 메소드 호출 : " + name + ", " + age);
    }
}
public class Ex05_04 {
    public static void main(String[] args) {
        Child child = new Child("홍길동", 25);
        child.display();
    }
}
