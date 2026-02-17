package inheritanceExample;

public class StudentUser {

    public static void main(String[] args) {
        EngStd e1 = new EngStd();
        e1.setStudent(101, "raj");
        e1.setEng(3, "EC");
//        e1.getStudent();
        e1.getEng();
        System.out.println(e1.toString());
        System.out.println(e1.result(40));
        MediStd m1 = new MediStd();
        m1.setStudent(102, "gouri");
        m1.setMediStd(5, "artho");
        m1.getMediStd();
        System.out.println(m1.result(40));
    }
}
