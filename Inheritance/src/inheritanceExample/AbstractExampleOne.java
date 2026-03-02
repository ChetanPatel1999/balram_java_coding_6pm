package inheritanceExample;

abstract class base {

    public void m1() {
        //code
    }

    public void m2() {
        //code
    }

     abstract public void m3(); //abstract method

    abstract public void m4();//abstract method
}

class derived extends base {

    public void m3() {
        //code
    }

    public void m4() {
        //code
    }

}

public class AbstractExampleOne {

    public static void main(String[] args) {
        derived d1 = new derived();
        d1.m1();
    }
}
