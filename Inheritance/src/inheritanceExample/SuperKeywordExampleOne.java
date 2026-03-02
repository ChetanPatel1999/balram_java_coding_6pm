package inheritanceExample;

class Base {

    int data = 90;

    void info() {
        System.out.println("base info is called");
    }
}

class Derived extends Base {

    int data = 400;

    public void show() {
        int data = 34;
        System.out.println("data :" + data);
        System.out.println("data :" + this.data);
        System.out.println("base data :" + super.data);
    }

    void info() {
        System.out.println("derived info is called");
    }

    void hello() {
        super.info();
    }
}

public class SuperKeywordExampleOne {

    public static void main(String[] args) {
        Derived d1 = new Derived();
        d1.show();
        d1.hello();
    }
}
