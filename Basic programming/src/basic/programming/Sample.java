package basic.programming;
public class Sample {
    public static void main(String[] args) {
       int a= Integer.parseInt(args[0]);
       int b= Integer.parseInt(args[1]);
       int res=a+b;
        System.out.println("sum = "+res);
        Demo d1=new Demo();
        d1.show();
        Test t1 = new Test();
        t1.display();
    }
}
