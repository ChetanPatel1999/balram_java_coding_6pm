package class_and_object;

public class StudentUser {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        Student.setColalgeName("holker Science Collage");

        s1.setStudent("raj", 101, 78); 
        s2.setStudent("rupesh", 102, 90);
        s3.setStudent("balram", 103, 4);
        s4.setStudent("devendra", 104, 100);
        s5.setStudent("devendra", 104, 100);
 
        s1.getStudentResultCard();
        s2.getStudentResultCard();
        s3.getStudentResultCard();
        s4.getStudentResultCard();

        Student.getTotalStudent();
        Student.getTotalResult();

        Student.helleUser();

//        s1.average(s2);
//        s1.average(s3);
//        s2.average(s4);
        Student.average(s3, s2);
        Student.average(s1, s2, s3);
        Student.average(s1, s2, s3, s4);

//        Student.gretestPercent(s1, s2);
//        Student.gretestPercent(s1, s3);
    }
}
