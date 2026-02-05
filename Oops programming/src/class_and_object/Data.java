/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_and_object;

public class Data {

    int num1;
    int num2;

    Data(int a, int b) {
        num1 = a;
        num2 = b;
    }

    void ChangeData(int a, int b) {
        num1 = a;
        num2 = b;
    }

    void display() {
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        Data d1 = new Data(56, 78);
        d1.display();
        d1.ChangeData(12, 5);
        d1.display();
        d1.ChangeData(8, 51);
        d1.display();
    }
}
