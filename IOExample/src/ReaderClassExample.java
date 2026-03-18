
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderClassExample {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("C:\\Users\\PC\\Desktop\\Demo\\ram.txt");
        char ch[] = new char[20];
        fr.read(ch);
        String s = new String(ch);
//        for(char val:ch)
//        {
//            System.out.print(val);
//        }

        System.out.println(s);
        fr.close();

    }
}
