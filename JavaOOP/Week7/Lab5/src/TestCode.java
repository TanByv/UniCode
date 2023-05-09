import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.Color;

public class TestCode {
    public static void main(String[] args) {
        int N = 20;
        double circleProbability = 0.7;

        Random rGen = new Random();

        double minArea = 0.0005;

        ArrayList < someshape > othershapes = new ArrayList < someshape > ();

        int canvasWidth = 750, canvasHeight = 750;
        StdDraw.setCanvasSize(canvasWidth, canvasHeight);

        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);

        StdDraw.enableDoubleBuffering();

        StdDraw.clear(StdDraw.WHITE);

        int shapeCounter = 0;
        while (shapeCounter < N) {

            double xCenter = rGen.nextDouble(), yCenter = rGen.nextDouble();

            double shapeType = rGen.nextDouble();

            if (shapeType <= circleProbability) {

                double radius = rGen.nextDouble() / 10;

                somecircle c = new somecircle(xCenter, yCenter, radius);

                if (c.computeArea() >= minArea) {
                    othershapes.add(c);
                    shapeCounter++;
                }
                
            } else {

                double width = rGen.nextDouble() / 5, height = rGen.nextDouble() / 5;

                somerectangle r = new somerectangle(xCenter, yCenter, width, height);

                if (r.computeArea() >= minArea) {
                    othershapes.add(r);
                    shapeCounter++;
                }
            }
        }

        Collections.sort(othershapes);

        for (someshape s: othershapes)

            s.draw();

        othershapes.get(N - 1).highlight();

        for (someshape s: othershapes)

            System.out.println(s);

        System.out.println("Program finished.");
    }
}

abstract class someshape implements Comparable<someshape> {
    protected double x;
    protected double y;
    protected Color color;

    public someshape(double x, double y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract void draw();

    public abstract double computeArea();

    public void highlight() {
        Color previousColor = color;
        color = StdDraw.GREEN;
        draw();
        color = previousColor;
    }

    @Override
    public int compareTo(someshape otherShape) {
        double thisArea = this.computeArea();
        double otherArea = otherShape.computeArea();

        if (thisArea < otherArea) {
            return -1;
        } else if (thisArea > otherArea) {
            return 1;
        } else {
            return 0;
        }
    }
}

class somecircle extends someshape {

    private double radius;

    public somecircle(double x, double y, double radius) {

        super(x, y, StdDraw.PRINCETON_ORANGE);
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {

        StdDraw.setPenColor(color);
        StdDraw.filledCircle(x, y, radius);

        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.circle(x, y, radius);

        StdDraw.text(x, y, String.format("%.3f", computeArea()));

        StdDraw.show();
        StdDraw.pause(100);
    }

    @Override
    public String toString() {
        return "Circle: " + String.format("%.16f", computeArea());
    }
}

class somerectangle extends someshape {

    private double width, height;

    public somerectangle(double x, double y, double width, double height) {

        super(x, y, StdDraw.BOOK_LIGHT_BLUE);

        this.width = width;
        this.height = height;
    }

    public double computeArea() {
        return width * height;
    }

    public void draw() {

        StdDraw.setPenColor(color);
        StdDraw.filledRectangle(x, y, width / 2, height / 2);

        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.rectangle(x, y, width / 2, height / 2);

        StdDraw.text(x, y, String.format("%.3f", computeArea()));

        StdDraw.show();
        StdDraw.pause(100);
    }

    @Override
    public String toString() {
        return "Rectangle: " + String.format("%.16f", computeArea());
    }
}