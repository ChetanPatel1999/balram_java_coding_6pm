package inheritanceExample;

public abstract class Student {

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

    abstract String resultProcessing(int per);

}
