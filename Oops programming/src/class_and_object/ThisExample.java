package class_and_object;

class Game {

    int x;
    int y;
    int z;

    Game(int a) {
        x = a;
    }

    Game(int a, int b) {
        this(a);
        y = b;

    }

    Game(int a, int b, int c) {
        this(a, b);
        z = c;
        display();
    }

    void setData(int a, int b) {
        setData(a, b);
//        display();
    }

    void display() {
        System.out.println("x,y,z =" + x + "," + y + "," + z);
    }
}

public class ThisExample {

    public static void main(String[] args) {
        Game g1 = new Game(12, 78, 89);
//        g1.display();
    }
}
