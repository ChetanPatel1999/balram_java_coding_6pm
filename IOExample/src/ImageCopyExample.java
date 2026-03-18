
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageCopyExample {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\PC\\Desktop\\myfolder\\paint.png");
        byte b[] = new byte[fis.available()];
        fis.read(b);
        fis.close();
        
        FileOutputStream fos= new FileOutputStream("C:\\Users\\PC\\Desktop\\Demo\\paintCopy.png");
        fos.write(b);
        fos.close();
        
        System.out.println("image copy succefully");
    }

}
