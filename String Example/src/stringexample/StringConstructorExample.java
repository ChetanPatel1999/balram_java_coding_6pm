package stringexample;

public class StringConstructorExample {

    public static void main(String[] args) {
//        String s1 = new String();
//        System.out.println(s1.length());
//        String s1 = new String("indore");
//        System.out.println(s1);

//        char ch[] = {'c', 'h', 'e', 't', 'a', 'n'};
//
//        String s1 = new String(ch,1,3);
//        System.out.println(s1);
//        byte arr[] = {65, 66, 67, 68, 69};
//
//        String s1 = new String(arr); //ABCDE
//        System.out.println(s1);
//        byte arr[] = {65, 66, 67, 68, 69};
//
//        String s1 = new String(arr,2,2); //ABCDE
//        System.out.println(s1);
        StringBuffer s1 = new StringBuffer("indore");
        String s2 = new String(s1);
        System.out.println(s2);

    }
}
//string class Constructor
//String();   0 arg constructor
//String("indore")  1 parameter string type
//String(char ch[])  pass character array
//String(char[] value, int offset, int count);  
//String(byte[] bytes)  // pass byte array
//String(byte[] bytes, int offset, int length)
//String(StringBuffer buffer) // stringBuffer object pass