package JavaOOP.Week2.Afterclass2;

public class Afterclass2_Encapsulation {
    private double radius = 1.0;
    private static int numberOfObjects = 0;
 
    public Afterclass2_Encapsulation() {
        numberOfObjects++;
    }
 
    public Afterclass2_Encapsulation(double radius) {
        this.radius = radius;
        numberOfObjects++;
    }
 
    public double getRadius() {
        return radius;
    }
 
    public void setRadius(double radius) {
        this.radius = radius;
    }
 
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
 
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
