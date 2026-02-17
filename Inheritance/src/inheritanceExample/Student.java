package inheritanceExample;

public class Student {

    private int rno;
    private String name;

    public void setStudent(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }

    public void getStudent() {
        System.out.println("Student name : " + name);
        System.out.println("Student rno : " + rno);
    }

    String result(int per) {
        return per >= 33 ? "pass" : "fail";
    }
}
