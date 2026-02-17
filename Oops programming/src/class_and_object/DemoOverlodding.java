package class_and_object;

public class DemoOverlodding {

    static void add(int a) {
        System.out.println("sum = " + (a + 50));
    }

    static void add(String a) {
        System.out.println("sum = " + (a + 50));
    }

    static void add(int a, int b) {
        System.out.println("int,int");
        System.out.println("sum = " + (a + b));
    }

    static void add(double a, int b) {
        System.out.println("doubel , int");
        System.out.println("sum = " + (a + b));
    }

    static void add(int a, double b) {
        System.out.println("int , double");
        System.out.println("sum = " + (a + b));
    }

    static void add(int a, int b, int c) {
        System.out.println("sum = " + (a + b + c));
    }

    public static void main(String[] args) {
        add(12, 8.9);
        add(12.3, 30);
        add("hello");
        add(12);
        add(12, 5);
        add(4, 5, 6);
    }
}
