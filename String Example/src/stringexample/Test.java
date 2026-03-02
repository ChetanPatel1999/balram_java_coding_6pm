package stringexample;

public class Test {

    private int x;
    private int y;
    private String s;

    public Test(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Test(int x, int y,String s) {
        this.x = x;
        this.y = y;
        this.s = s;
    }

    void display() {
        System.out.println("x = " + x);
        System.out.println("y= " + y);
    }

    public void changeData(int a, int b) {
        x = a;
        y = b;
    }
}
