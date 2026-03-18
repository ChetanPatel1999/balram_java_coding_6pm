
import java.io.FileOutputStream;

public class FileWriteExample {

    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\PC\\Desktop\\Demo\\info.txt");
//        FileOutputStream fos = new FileOutputStream("C:\\Users\\PC\\Desktop\\Demo\\info.txt" ,true); //appen new data not delete privious data
//        fos.write(65);
//        fos.write(66);
//        fos.write(67);
//        fos.write(68);
        String s = "hello my name is chetan";
        byte b[] = s.getBytes();
//        byte b[] = {65, 66, 67};
//        fos.write(b);
        fos.write(b, 6, 10);
//        for (int i = 0; i < s.length(); i++) {
//            fos.write(s.charAt(i));
//        }
        fos.close();
        System.out.println("data write succefully ");
    }
}
