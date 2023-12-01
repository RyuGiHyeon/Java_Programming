package week_05;

class TV{
    private int size;
    public TV(int size){
        this.size = size;
    }
    protected int getSize(){
        return size;
    }
}
public class Ex05_01 extends TV {
    public int nColors;
    public Ex05_01(int size, int nColors){
        super(size);
        this.nColors = nColors;
    }
    public void printProperty(){
        System.out.print("TV 속성 : ");
        System.out.println(getSize() + "인치 / " + nColors + "해상도");
    }

    public static void main(String[] args) {
        Ex05_01 myTV = new Ex05_01(32, 1024);
        myTV.printProperty();
    }
}
