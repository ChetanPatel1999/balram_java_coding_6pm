package class_and_object;

class Number {

    int num1;
    int num2;

    Number(int a, int b) {
        num1 = a;
        num2 = b;
    }

    void getNumber() {
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("-------------------");
    }

    void addition() {
        System.out.println("sum = " + (num1 + num2));
        System.out.println("-------------------");
    }

    void additionOfNum1SameObject() {
        System.out.println("sum = " + (num1 + num1));
        System.out.println("-------------------");
    }

    void additionOfNum1DifferentObject(Number obj) {
        System.out.println("sum = " + (num1 + obj.num1));
        System.out.println("-------------------");
    }

    void additionOfNum2DifferentObject(Number obj) {
        System.out.println("sum = " + (num2 + obj.num2));
        System.out.println("-------------------");
    }
}

public class ObjectPassExample {

    public static void main(String[] args) {
        Number n1 = new Number(12, 5);
        Number n2 = new Number(15, 20);
        n1.getNumber();
        n2.getNumber();
        n1.additionOfNum1DifferentObject(n2);
        n2.additionOfNum2DifferentObject(n1);
    }
}
