
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamExample {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\PC\\Desktop\\Demo\\hello.txt");

         System.out.println((char)fis.read());//A
         System.out.println((char)fis.read());//B
         fis.skip(2);// C D
         System.out.println((char)fis.read());//E
         System.out.println((char)fis.read());
//          System.out.println(fis.available());
//        byte b[] = new byte[fis.available()];
//        fis.read(b);
//        for (byte n : b) {
//            System.out.print((char) n);
//        }

//        while (true) {
//            num = fis.read();
//            if (num == -1) {
//                break;
//            }
//            System.out.print((char)num);
//        }
        System.out.println("");
        fis.close();
    }

}
