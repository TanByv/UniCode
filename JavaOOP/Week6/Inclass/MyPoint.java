package JavaOOP.Week6.Inclass;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(54.6, 12);
        MyPoint p2 = new MyPoint(5.13, 0.5);
        double distance = p1.distance(p2);
        System.out.println("The distance between p1 and p2 is: " + distance);
    }
}