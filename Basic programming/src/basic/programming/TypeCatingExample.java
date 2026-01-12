package basic.programming;

public class TypeCatingExample {

    public static void main(String[] args) {
        int age = 45;  // same data type same literals type
        double d = 12; // implicite type casting
        int val = 'k'; // implicite type casting
        int f = (int) 34.5;  //explicite casting 
        char ch = 65; // implicite type casting
        char ch2 = (char) 97L; //explicite type casting
        // int data="345"; // not coverted string to int
        // int a = true;// not coverted boolean to int
        System.out.println(ch);
    }
}
