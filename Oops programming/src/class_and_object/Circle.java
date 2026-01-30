package class_and_object;

public class Circle {

    private double radius;
    private double area;
    private double circumference;

    public void setRadius(int r) {
        radius = r;
    }

    public void calculateArea() {
        area = 3.141 * radius * radius;
    }

    public void calculateCircumference() {
        circumference = 2 * 3.141 * radius;
    }

    public double getAreaOfCircle() {
        return area;
    }

    public double getCircumferenceOfCircle() {
        return circumference;
    }

    public double getRadius() {
        return radius;
    }

}
