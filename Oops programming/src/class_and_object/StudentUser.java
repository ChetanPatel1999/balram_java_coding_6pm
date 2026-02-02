package class_and_object;

public class StudentUser {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        
        s1.setColalgeName("holker Science Collage");
                
        s1.setStudent("raj", 101, 78);
        s2.setStudent("rupesh", 102, 90);
        s3.setStudent("balram", 103, 4);
        s4.setStudent("devendra", 104, 100);
        
        s1.getStudentResultCard();
        s2.getStudentResultCard();
        s3.getStudentResultCard();
        s4.getStudentResultCard();
        
        s2.getTotalStudent();
        s2.getTotalResult();

    }
}
