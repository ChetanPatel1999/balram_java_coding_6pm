
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class GamePlayer {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int xPos;
        int yPos;
        System.out.println("enter 'new' for new game and enter 'old' to continue old game :");
        String s = sc.next();
        Game g = null;
        if (s.equals("new")) {
            g = new Game();
        } else if (s.equals("old")) {
            FileInputStream fis = new FileInputStream("C:\\Users\\PC\\Desktop\\Demo\\gameData.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            g=(Game)ois.readObject();
            fis.close();
            ois.close();
        }

        System.out.print("enter horizantel position : ");
        xPos = sc.nextInt();
        System.out.print("enter vertical position : ");
        yPos = sc.nextInt();
        g.move(xPos, yPos);
        g.display();
        FileOutputStream fos = new FileOutputStream("C:\\Users\\PC\\Desktop\\Demo\\gameData.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(g);
        fos.close();
        oos.close();
        System.out.println("object saved ...");
        System.out.println("game is end...");
    }
}
