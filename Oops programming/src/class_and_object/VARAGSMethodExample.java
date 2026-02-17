package class_and_object;

public class VARAGSMethodExample {

//    static void add(int... a) {
//        int i;
//        int sum = 0;
//        for (i = 0; i < a.length; i++) {
//            sum = sum + a[i];
//        }
//        System.out.println("sum = " + sum);
//    }
    static void add(String s, int b, int... a) {
        int sum = 0;
        for (int i : a) {
            sum = sum + i;
        }
        System.out.println("sum = " + sum);
        System.out.println("b = " + b);
        System.out.println("b = " + s);
    }

    static void add(int... a) {
        int sum = 0;
        for (int i : a) {
            sum = sum + i;
        }
        System.out.println("sum = " + sum);
    }

    static void add(double... a) {
        double sum = 0;
        for (double i : a) {
            sum = (double) sum + i;
        }
        System.out.println("Sum = " + sum);
    }
    static void display(String... s) {
        for (String item : s) {
            System.out.println(item);
        }
        System.out.println("---------------------");
    }

    public static void main(String[] args) {

//        add("raj", 12, 8, 10, 20);
        add(12, 34, 67, 88);
        add(4.4, 44.5);
        display();
        display("home");
        display("home", "pen");
        display("home", "pen", "colors");

    }
}
