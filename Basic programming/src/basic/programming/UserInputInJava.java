package basic.programming;

import java.util.Scanner;

public class UserInputInJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        float height;
        System.out.print("enter your name : ");
        name = sc.next();
        System.out.print("enter your age : ");
        age = sc.nextInt();
        System.out.print("enter your height : ");
        height = sc.nextFloat();
        System.out.println("name of person = " + name);
        System.out.println("age of person = " + age);
        System.out.println("height of person = " + height);

        char ch;
        System.out.print("enter a char : ");
        ch = sc.next().charAt(0);
        System.out.println("charcter is : " + ch);

    }
}
