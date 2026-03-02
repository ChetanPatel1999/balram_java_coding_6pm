/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringexample;

public class StringExampleTwo {

    static void stringOne() {
        //how to visit string character
        String s1 = "indore";
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }
    }

    static void stringTwo() {
        //cont vovel in string
        String s1 = "indore";
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("total vovel Count : "+count);
    }

    public static void main(String[] args) {
        stringTwo();
    }

}
