package week_04;

import java.util.Scanner;

public class Ex04_08 {
    static class Person{
        String name;
        public Person(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }

    }
    public static void changeName(Person person, String newName){
        person.setName(newName);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person = new Person("John");

        System.out.println("Original name: " + person.getName());

        System.out.print("새 이름을 입력하세요 : ");
        String newName = scanner.nextLine();
        changeName(person, newName);

        System.out.println("Modified name : " + person.getName());

        scanner.close();
    }



}
