
import java.io.Serializable;

//if want to not store some data member of object so use transient keyword before that data member declaration
public class Game implements Serializable{

    private int xPos;
    private transient int yPos;

    public void move(int xPos, int yPos) {
        this.xPos = this.xPos + xPos;
        this.yPos = this.yPos + yPos;
    }

    public void display() {
        System.out.println("game object position : ");
        System.out.println("xPos :" + xPos);
        System.out.println("yPos :" + yPos);
    }
}
