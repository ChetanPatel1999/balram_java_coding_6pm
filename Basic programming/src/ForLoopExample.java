
public class ForLoopExample {

    public static void main(String[] args) {
        //wap to print a msg 5 times
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("hello students");
//        }

////wap to print number 1 to 10;
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
//wap to print number 1 to 10;
//        for (int i = 1; i <= 30; i++) {
//            if (i % 4 == 0) {
//                System.out.println(i);
//            }
//        }

       // wap to print factors of given number;
       int n=15;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

}
