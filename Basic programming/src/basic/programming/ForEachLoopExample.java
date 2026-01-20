package basic.programming;

public class ForEachLoopExample {

    public static void main(String[] args) {
//        int arr[] = {12, 34, 56, 78, 90, 60, 20};
        //visit array normal for loop
//        for (int i = 0; i < 7; i++)//1
//        {
//            System.out.println(arr[i]);
//        }

        //visit array element using for each loop
//        for(int var:arr)
//        {
//            System.out.println(var);
//        }
        int arr[] = {10, 30, 50, 20, 90};
        int sum = 0;
//        for (int i = 0; i < 5; i++) //5
//        {
//            sum = sum + arr[i];//200
//        }
        for (int temp : arr) {
            sum = sum + temp;
        }
        System.out.println("sum = " + sum);
    }

}
