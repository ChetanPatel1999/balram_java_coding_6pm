package class_and_object;

public class Test {

    int x;
    int y;

    Test(int a, int b) {
        x = a;
        y = b;
    }

    void show() {
        int x = 167;
        System.out.println("x = " + this.x + ", y = " + y);
        System.out.println("locak var = " + x);
    }
    public static void main(String[] args) {
        Test t1 = new Test(12, 45);
        Test t2 = new Test(100, 200);
        t1.show();
//       t2.show();

//        Test t1;
//        new Test(12, 56);
//        Test t2 = new Test(40, 50);
//        t2.show();
//        Test t3 = t2;
//        t3.show();
//        t1 = t2;
//        t1.show();
//
//        t1 = new Test(100, 200);
//        t1.show();
//        
//        t2=new Test(4,5);
//        t2.show();
//        t3.show();
//        
//        t3=new Test(300,400);
//        t3.show();
    }
}
