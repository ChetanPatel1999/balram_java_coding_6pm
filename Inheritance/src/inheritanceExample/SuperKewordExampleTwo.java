package inheritanceExample;

class prohit {

    public prohit(int a) {
        System.out.println("base 1 arg");
    }

    public prohit(int a, int b) {
        System.out.println("base 2 arg");
    }

}

class raj extends prohit {

    public raj() {
        super(34);
        System.out.println("derived 0 arg");
    }

    public raj(int a) {
        super(a);
        System.out.println("derived 1 arg");
    }

    public raj(int a, int b) {
        super(45);
        System.out.println("derived 2 arg");
    }
}

public class SuperKewordExampleTwo {

    public static void main(String[] args) {
        raj r1 = new raj(12, 56);
    }

}
