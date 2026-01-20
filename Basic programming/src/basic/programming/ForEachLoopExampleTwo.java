package basic.programming;

public class ForEachLoopExampleTwo {

    static void sumArray(int arr[]) {
        int sum = 0;
        for (int temp : arr) //5
        {
            sum = sum + temp;//200
        }
        System.out.println("sum = " + sum);
    }

    public static void main(String[] args) {
//        int arr1[] = {12, 56, 78, 89, 99};
//        int arr2[] = {4, 6, 2, 7, 8};
//        int arr3[] = {41, 62, 21};
//        sumArray(arr1);
//        sumArray(arr2);
//        sumArray(arr3);

//        String city[] = {"indore", "dewas", "mhow", "ratlam"};
//        for (String devendra : city) {
//            System.out.println(devendra);
//        }
//        double height[] = {4.5, 6.3, 5.3, 6.1};
//        for(double d:height)
//        {
//            System.out.println(d);
//        }
//        boolean b[] = {true, false, true, true, false};
//        for (boolean val : b) {
//            System.out.println(val);
//        }
//        int arr[] = {12, 34, 556, 655, 74};
//        for (int val : arr) {
//            if (val % 2 == 1) {
//                System.out.println(val);
//            }
//        }
//        int arr[] = {12, 34, 556, 655, 74};
//        int sum, rem;
//        for (int val : arr) {
//            sum = 0;
//            while (val > 0) {
//                rem = val % 10;
//                sum = sum + rem;
//                val = val / 10;
//            }
//            System.out.println(sum);
//        }
        int arr[] = {12, 34, 556, 655, 74};
        for (int i = 0; i < 5; i++) {
            arr[i] = arr[i] + 5;
        }
        for (int val : arr) {
            System.out.println(val+5);
        }
    }

}
