
import java.io.File;
import java.io.IOException;

public class FileExampleTwo {

    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\PC\\Desktop\\Demo\\home.txt");
        File file2 = new File("C:\\Users\\PC\\Desktop\\Demo\\ghar.txt");
        file1.renameTo(file2);
     
        
//        if(file.delete())
//        {
//            System.out.println("folder is deleted");
//        }
//        else
//        {
//            System.out.println("file is not exist");
//        }
//        if(file.delete())
//        {
//            System.out.println("file is deleted");
//        }
//        else
//        {
//            System.out.println("file is not exist");
//        }
//        if(file.createNewFile())
//        {
//            System.out.println("new file is created");
//        }
//        else
//        {
//            System.out.println("file is alreaddy exist");
//        }
//        if( file.mkdir())
//        {
//            System.out.println("new folder is created");
//        }
//        else
//        {
//            System.out.println("folder is already exist");
//        }

    }
// file.mkdir() create new folder 
//    file.createNewFile()
//    file.delete()  // its delete file and folder both
}
