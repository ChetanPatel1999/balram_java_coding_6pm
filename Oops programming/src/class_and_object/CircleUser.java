
package class_and_object;

public class CircleUser {
    public static void main(String[] args) {
        Circle c1= new Circle();
        c1.setRadius(5);
        c1.calculateArea();
        c1.calculateCircumference();
        c1.area=4;
        System.out.println("radius : "+c1.getRadius());
        System.out.println("area : "+c1.getAreaOfCircle());
        System.out.println("circumference : "+c1.getCircumferenceOfCircle());
    }
 
}
