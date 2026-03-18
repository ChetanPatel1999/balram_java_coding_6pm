
import java.io.FileWriter;
import java.io.IOException;


public class WriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("C:\\Users\\PC\\Desktop\\Demo\\ram.txt");
        String s="hello this data is write using FileWriter class\n";
//        fw.write(s);
        fw.write(s,6,20);
        fw.close();
        System.out.println("write data successfully");
    }
}
