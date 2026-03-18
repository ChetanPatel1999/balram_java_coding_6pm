
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileOutputStreamExample {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("C:\\Users\\PC\\Desktop\\Demo\\cube.txt", true);
        int num, cube;
        System.out.print("enter a num : ");
        num = sc.nextInt();
        cube = num * num * num;
        System.out.println("cube of " + num + " = " + cube);
        String res = "cube of " + num + " = " + cube+"\n";
        byte arr[] =res.getBytes();
        fos.write(arr);
        fos.close();
    }

}
