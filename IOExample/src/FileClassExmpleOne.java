
import java.io.File;

public class FileClassExmpleOne {

    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\PC\\Desktop\\Demo\\home.txt");
        if(f1.isFile())
        {
            System.out.println("its file");
        }
        else
        {
            System.out.println("its not a file");
        }
//        if (f1.isDirectory()) {
//            String filesName[] = f1.list();
//
//            for (String name : filesName) {
//                System.out.println(name);
//            }
//        }
//        else
//        {
//            System.out.println("not a folder");
//        }
//        if (f1.exists())
//        {
//           System.out.println(f1.length()); 
//        }
//        else
//        {
//            System.out.println("file is not exist");
//        }
//        System.out.println(f1.isHidden());
//        System.out.println(f1.canWrite());

    }

}
// f1.length() // return file length
// f1.exist () // its return true if file exist
// f1.isHidden() // return true if file is hidden other wise false
// f1.canWrite() //
// f1. list()  // its return all file name inside folder
//f1.isDirectory() // its check file is folder or not
