/*package week_05;


import java.util.Scanner;
class GameObject {
    protected int distance;
    protected int x, y;

    public GameObject(int startX, int startY, int distance){
        this.x = startX;
        this.y = startY;
        this.distance = distance;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public boolean collide(GameObject p){
        return this.x == p.getX() && this.y == p.getY();
    }

    protected void move(){
        //Default move behavior, to be overridden by subclasses
    }

    protected char getShape(){
        //Default shape, to be overridden by subclasses
        return '-';
    }
}
class PacMan extends GameObject{
    private Scanner scanner = new Scanner(System.in);

    public PacMan(int startX, int startY, int distance){
        super(startX, startY, distance);
    }

    @Override
    protected void move(){








    }

    @Override
    protected char getShape(){
        return 'C';
    }
}

public class Challenge_05{
    private char[][] map = new char[10][20];
    private PacMan pacMan;
    private Cookies[] cookies = new Cookies[5];
    private int numberofCookies;
    private int cookiesEaten = 0;

    public static void main(String[] args) {
        Challenge_05 game = new Challenge_05();
        game.run();
    }

    public void run(){
        System.out.println("** PacMan 게임에 오신 것을 환영합니다 **");

        //쿠키를 초기화 / 생성
        generateCookies();

        while (true){








        }
    }

    private void generateCookies(){



    }
}

class Cookies extends GameObject{
    private int moveCount = 0;

    public cookies(int startX, int startY, int distance){
        super(startX, startY,distance);
    }

    @Override
    protected void move(){


        //입력 횟수가 3의 배수일 때 쿠키가 4가지 방향 중 랜덤하게 한 칸씩 움직임











    }

    @Override
    protected char getShape(){
    return '*';
    }

    private void moveCookies(){





    }

    public void drarMap(){
        for (int i=0; i<10; i++){
            for (int k=0; k<20; k++) {
                map[i][k] = '-';
            }
        }




        for (int i=0; i<10; i++){
            for (int k=0; k<20; k++){
                System.out.print(map[i][k]);
            }
            System.out.println();
        }
    }
}*/
