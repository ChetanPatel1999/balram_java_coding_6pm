package basic.programming;

import java.util.Scanner;

public class IfElaseExample {

    static void isCharAlphabet(char ch) {
//        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') 
        if (ch >= 97 && ch <= 122 || ch >= 65 && ch <= 90) {
            System.out.println("char is alphabet");
        } else {
            System.out.println("char is not alphabet");
        }
    }

    static void isValidTringle() {
        Scanner sc= new Scanner(System.in);
        int a1,a2,a3;
        System.out.print("enter a1 :");
        a1=sc.nextInt();
        System.out.print("enter a2 :");
        a2=sc.nextInt();
        System.out.print("enter a3 :");
        a3=sc.nextInt();
        
        if (a1 + a2 + a3 == 180 && a1 > 0 && a2 > 0 && a3 > 0) {
            System.out.println("angles is valid for tringle");
        } else {
            System.out.println("angles is not valid for tringle");
        }
    }

    public static void main(String[] args) {
        isValidTringle();
//        isCharAlphabet('@');
//        System.out.println("hello students");
//        if (true) {
//            System.out.println("this stmnt inside if");
//        }
//        System.out.println("after if ");

//wap to check you are eligibel for vote or note.
//        int age = 18;
//        if (age < 18) {
//            System.out.println("not eligible for voting");
//        } else {
//            System.out.println("eligible for voting");
//        }
//wap to check number is positive or nagative.
//        int num = -45;
//        if (num >= 0) {
//            System.out.println("num is positive");
//        } else {
//            System.out.println("num is nagative");
//        }
    }
}
