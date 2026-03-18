/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringexample;

import java.util.Scanner;
import java.util.StringJoiner;

public class StringJoinerExampleTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringJoiner data = new StringJoiner(",", "(", ")");
        String s;
        for (int i = 0; i < 5; i++) {
            System.out.println("enter your freind name : ");
            s = sc.next();
            data.add(s);
        }
        System.out.println(data);
    }
}
