package stringexample;

import java.util.StringTokenizer;

public class StringTokenizerExample {

    public static void main(String[] args) {
//        String s1 = "hello my name chetan patel";
//        StringTokenizer tokens = new StringTokenizer(s1);
//        System.out.println(tokens.hasMoreTokens());
//        System.out.println(tokens.nextToken());
//        System.out.println(tokens.nextToken());
//        System.out.println(tokens.nextToken());
//        System.out.println(tokens.nextToken());
//        System.out.println(tokens.nextToken());
//        System.out.println(tokens.hasMoreTokens());

//        System.out.println(tokens.countTokens());
//        while (tokens.hasMoreElements()) {
//            System.out.println(tokens.nextToken());
//        }
//        System.out.println(tokens.countTokens());
        String s1 = "indore,mujjain,mhow,bhopal";
        StringTokenizer tokens = new StringTokenizer(s1,"m");
        System.out.println(tokens.countTokens());
        System.out.println(tokens.nextToken());
        System.out.println(tokens.nextToken());
    }
}
