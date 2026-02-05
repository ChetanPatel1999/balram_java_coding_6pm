package class_and_object;

public class Title {

    Title() {
        System.out.println("0 arg constructor is called");
    }

    Title(int a) {
        System.out.println("1 arg constructor is called");
    }

    void display() {
        System.out.println("hi i am display");
    }

    void show() {
        System.out.println("hi i am show");
    }

    public static void main(String[] args) {
        Title t1 = new Title(12);
//        Title t2 = new Title(12,89);
        Title t3 = new Title();
    }
}
