package ArrayExamples;

import java.util.Scanner;

public class ArrayExampleOne {

    public static void main(String[] args) {
//        int[] arr = {12, 34, 56, 78, 90};
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);

//        int[] arr = {12, 34, 56, 78, 90};
//        System.out.println("array element are : ");
//        for (int i = 0; i < arr.length; i++) {
//
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println("");
//        int[] arr = {12, 34, 56, 78, 90};
//        System.out.println("array element are : ");
//        for (int num : arr) {
//            System.out.println(num);
//        }
//        System.out.println("");
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println(arr.length);
        System.out.println("enter array element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("array element are : ");
        for (int num : arr) {
            System.out.print(num+" ");
        }
        System.out.println("");

    }

}
