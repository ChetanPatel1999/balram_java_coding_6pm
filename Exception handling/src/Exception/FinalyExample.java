/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

public class FinalyExample {

    public static void main(String[] args) {
        System.out.println("main method is start-----");
        int x = 0, y = 0, z = 0;
        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            z = x / y;
        } catch (ArrayIndexOutOfBoundsException exe) {
            System.out.println("input error....");
        } catch (ArithmeticException exe) {
            System.out.println("division by zero error ....");
            z = x / 2;
        } finally {
            System.out.println("finally run always times");
        }
        System.out.println("division : " + z);
        System.out.println("program run succefully");
    }
}
