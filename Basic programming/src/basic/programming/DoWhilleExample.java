package basic.programming;

import java.util.Scanner;

public class DoWhilleExample {

    public static void main(String[] args) {
//        do 
//        {
//            System.out.println("hello students");
//        } 
//        while (12 > 55);
//        System.out.println("by students");

//        //print sum of number till user want to add numbers.
        Scanner sc = new Scanner(System.in);
//        int num, sum = 0;
//        do {
//            System.out.print("enter num : ");
//            num = sc.nextInt();
//            sum = sum + num;
//            System.out.print("you want to add more number press 1  : ");
//            num = sc.nextInt();
//        } while (num == 1);
//        System.out.println("sum = "+sum);

// Keep taking marks from the user until they enter a mark greater than 100 
//(invalid), then stop.
        int marks, total = 0;
        do {
            System.out.print("enter marks : ");
            marks = sc.nextInt();
            total = total + marks;
            System.out.println("Total marks : " + total);
        } while (marks < 100);
    }

}
