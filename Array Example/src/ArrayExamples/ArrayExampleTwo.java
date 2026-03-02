package ArrayExamples;

public class ArrayExampleTwo {

    static void arrOne() {
        int[] arr = {4, 6, 3, 7, 5};
        int sum = 0;
        for (int num : arr) {
            sum = sum + num;
        }
        System.out.println("sum of all array element : " + sum);
    }

    static void arrTwo() {
        int[] arr = {4, 6, 3, 7, 5, 12};
        int sum = 0;
        System.out.println("even element from array : ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("");

    }

    static void arrThree() {
        double[] arr = {4.5, 7.8, 9.4, 12.5};
        for (double num : arr) {
            System.out.println(num);
        }
    }

    static void arrString() {
        String[] citys = {"indore", "ujjain", "ratlam", "mhow"};
        for (String city : citys) {
            System.out.println(city);
        }
    }

    static void arrBoolean() {
        boolean[] arr = {true, true, false, false, true};
        for (boolean num : arr) {
            System.out.println(num);
        }
    }

    static void arrEmploy() {
        Employ[] emp = new Employ[3];
//        emp[0] = new Employ();
//        emp[1] = new Employ();
//        emp[2] = new Employ();
        for (int i = 0; i < emp.length; i++) {
            emp[i] = new Employ();
        }
        emp[0].setEmploy("raj", 101);
        emp[1].setEmploy("dev", 102);
        emp[2].setEmploy("shyam", 103);
        for (Employ e : emp) {
            e.getEmploy();
        }
    }

    public static void main(String[] args) {
//        arrOne();
//        arrTwo();

//        arrThree();
//        arrString();
//        arrBoolean();
        arrEmploy();
    }
}
