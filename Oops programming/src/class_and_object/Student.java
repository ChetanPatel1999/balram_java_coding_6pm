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
    }

}
