package class_and_object;
public class Employ {

    private String name;
    private int id;
    private double sallary;

    public Employ(String name, int id, double sallary) {
        this.name = name;
        this.id = id;
        this.sallary = sallary;
    }
   
    void getEmploy() {
        System.out.println("Employ info : ");
        System.out.println("Employ name : " + name);
        System.out.println("Employ id : " + id);
        System.out.println("Employ sallary : " + sallary);
        System.out.println("--------------------------------");
    }
    
}
