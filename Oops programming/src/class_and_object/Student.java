package class_and_object;

public class Student {

    private String name;
    private int rno;
    private float per;
    static private int totalPass;
    static private int totalFail;
    static private int totalStudent;
    static private String collagName = "IIST";

    public void setStudent(String n, int r, float p) {
        name = n;
        rno = r;
        per = p;
        totalStudent++;
    }

    public static void setColalgeName(String n) {

        collagName = n;
    }

    public void getStudentResultCard() {
        System.out.println("Student result Card ! ");
        System.out.println("collage name  " + collagName);
        System.out.println("Student name : " + name);
        System.out.println("Student rno : " + rno);
        System.out.println("Student per : " + per);
        if (per >= 33) {
            System.out.println("Student Pass");
            totalPass++;
        } else {
            System.out.println("Student Fail");
            totalFail++;
        }
        System.out.println("----------------------------");
    }

    public static void getTotalResult() {

        System.out.println("Total pass : " + totalPass);
        System.out.println("Total Fail : " + totalFail);
        System.out.println("--------------------------");
    }

    public static void getTotalStudent() {

        System.out.println("total student : " + totalStudent);
        System.out.println("--------------------------");
    }

    public static void helleUser() {
        System.out.println("hello User !");
        System.out.println("sub badiya ya koi tention !");
        System.out.println("----------------------------------");
    }

//    public void average(Student obj) {
//        float ave;
//        ave = (per + obj.per) / 2;
//        System.out.println("average of " + name + " and " + obj.name + " = " + ave);
//        System.out.println("-------------------------------------------");
//    }
//    public static void average(Student obj1, Student obj2) {
//        float ave;
//        ave = (obj1.per + obj2.per) / 2;
//        System.out.println("average of " + obj1.name + " and " + obj2.name + " = " + ave);
//        System.out.println("-------------------------------------------");
//    }
//
//    public static void average(Student obj1, Student obj2, Student obj3) {
//        float ave;
//        ave = (obj1.per + obj2.per + obj3.per) / 3;
//        System.out.println("average of " + obj1.name + " and " + obj2.name + " and " + obj3.name + " = " + ave);
//        System.out.println("-------------------------------------------");
//    }
//
//    public static void average(Student obj1, Student obj2, Student obj3, Student obj4) {
//        float ave;
//        ave = (obj1.per + obj2.per + obj3.per + obj4.per) / 4;
//        System.out.println("average of " + obj1.name + " and " + obj2.name + " and " + obj3.name+" and " + obj4.name + " = " + ave
//        );
//        System.out.println("-------------------------------------------");
//    }
    public static void average(Student... obj) {
        double sum = 0;
        
        for (Student s : obj) {
            sum = sum + s.per;
        }
        double ave = sum / obj.length;
        System.out.printf("average = : %.2f\n", ave);
        System.out.println("-------------------------------------------");
    }

    public static void gretestPercent(Student obj1, Student obj2) {
        if (obj1.per > obj2.per) {
            System.out.println(obj1.name + " have greater percentage then " + obj2.name);
        } else {
            System.out.println(obj2.name + " have greater percentage then " + obj1.name);
        }
        System.out.println("---------------------------------------");
    }

}
