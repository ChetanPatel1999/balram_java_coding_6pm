package stringexample;

import java.util.StringJoiner;

public class StringJoinerExample {

    public static void main(String[] args) {
        String s1 = "indore";
        String s2 = "ujjain";
        String s3 = "mhow";
        String s4 = "ratlam";

//        StringJoiner join = new StringJoiner("<--->");
//        join.add(s1);
//        join.add(s2);
//        join.add(s3);
//        join.add(s4);
//        System.out.println(join);

        StringJoiner join = new StringJoiner(",","{","}");
        join.add(s1);
        join.add(s2);
        join.add(s3);
        join.add(s4);
        System.out.println(join);
     

    }

}
