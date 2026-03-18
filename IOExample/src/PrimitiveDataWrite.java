
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class PrimitiveDataWrite {

    public static void main(String[] args) throws Exception {
        int id = 101;
        double sallary = 4500.56;
        boolean isRemote = true;
        FileOutputStream fos = new FileOutputStream("C:\\Users\\PC\\Desktop\\Demo\\data.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(id);
        dos.writeDouble(sallary);
        dos.writeBoolean(isRemote);
        dos.close();
        System.out.println("data write successfully");

    }
}
