
import java.io.DataInputStream;
import java.io.FileInputStream;

public class PrimitiveDataRead {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:\\Users\\PC\\Desktop\\Demo\\data.txt");
        DataInputStream dis = new DataInputStream(fis);

        System.out.println("id : " + dis.readInt());
        System.out.println("sallary : " + dis.readDouble());
        System.out.println("isRemote : " + dis.readBoolean());
        dis.close();
    }
}
