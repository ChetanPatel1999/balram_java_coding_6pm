package Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CheckedExceptionExample {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        String s;
        s = args[0];
        String fileName = args[1];
        
            FileReader fr = new FileReader(fileName);
            FileWriter fw = new FileWriter(fileName);
            Class.forName("hello");
        
//        try {
//            FileReader fr = new FileReader(fileName);
//            FileWriter fw = new FileWriter(fileName);
//            Class.forName("hello");
//        } catch (Exception exe) {
//
//        }
    }

}
