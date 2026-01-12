package newpackage;

public class Sample {

    private void show() {
        System.out.println("hello i am show");
    }

    protected static void printmsg() {
        System.out.println("hello i am printmsg");
    }

     public static void main(String[] args) {
        System.out.println("hello program exicution start...");
        Sample obj = new Sample();
        System.out.println("progarm exicution complete");
        obj.show();
        printmsg();  
    }
}
