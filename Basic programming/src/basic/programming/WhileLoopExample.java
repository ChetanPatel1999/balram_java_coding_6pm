package basic.programming;

public class WhileLoopExample {

    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 5) {
//            System.out.println("hello bachho");
//            i = i + 1;
//        }

//        int i = 1;
//        while (i <= 10) {
//            i = i + 2;
//            System.out.println(i + 2);
//            i = i + 1;
//        }
//        int num = 342, a;
//        while (num != 0) {
//            a = num % 10;
//            System.out.println(a);
//            num = num / 10;
//        }
        int num = 342, a, s = 0;
        while (num != 0) {
            a = num % 10;
            s = s + a;
            num = num / 10;
        }
        System.out.println(s);
    }

}
