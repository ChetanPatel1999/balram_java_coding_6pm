package basic.programming;

public class LablingOfLoops {

    public static void main(String[] args) {
        m:
        for (int i = 1; i <= 5; i++)//5
        {
            n:
            for (int j = 1; j <= 5; j++)//6 
            {
                if (i == 3) {
                    continue n;
                }
                System.out.print(j);
            }
            System.out.println("");
        }

//find a first char in string which is present in 3 times in string.
//        String s = "abaibciddi1";
//        char ch;
//        int c = 0, f = 0;
//        m:
//        for (int i = 0; i < s.length(); i++) //2
//        {
//            ch = s.charAt(i);
//            for (int j = i; j < s.length(); j++) //1
//            {
//                if (ch == s.charAt(j)) {
//                    c++;//3
//                }
//                if (c == 3) {
//                    f = 1;
//                    System.out.println(ch);
//                    break m;
//                }
//            }
//            c = 0;
//
//        }
    }
}
