package inheritanceExample;

class A {

    void m1() {
        System.out.println("class A method 1");
    }

    void m2() {
        System.out.println("class A method 2");
    }
}

class B extends A{

    void m3() {
        System.out.println("class B method 3");
    }

    void m4() {
        System.out.println("class B method 4");
    }
}

public class InheritanceExampleOne {

    public static void main(String[] args) {
        B o1 = new B();
        o1.m1();
        o1.m2();
        o1.m3();
        o1.m4();
    }
}
