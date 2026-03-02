package stringexample;

public class StringExampleOne {

    public static void main(String[] args) {
        String s1 = new String("indore");
        String s2 = new String("indore");
        String s3 = "ujjain";
        String s4 = "ujjain";

        System.out.println(s1 == s2); //false
        System.out.println(s3 == s4);//true

//        Test t1 = new Test();//show error
        Test t1 = new Test(12, 45);
        Test t2 = new Test(12, 45, "hello");
        t2.changeData(60,100);
//        Test t3 = new Test("hello", 67, 89);//show erro

    }

}
