package Exception;

public class ExceptionHandlingExampleOne {

    public static void main(String[] args) {
        System.out.println("main method is start-----");
        int x = 0, y = 0, z = 0;
        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            z = x / y;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException exe) {
            System.out.println("input error....");
        } catch (ArithmeticException exe) {
            System.out.println("division by zero error ....");
            z = x / 2;
        } catch (Exception exe) {
            System.out.println("handle all exception");
        }
        System.out.println("division : " + z);
        System.out.println("program run succefully");
    }

}
