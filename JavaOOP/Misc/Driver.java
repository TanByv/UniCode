package JavaOOP.Misc;

import java.util.Scanner;

abstract class GeometricObject {
private String color = "white";
private boolean filled;
private java.util.Date dateCreated;

/** Construct a default geometric object */
protected GeometricObject() {
}

/** Construct a geometric object with color and filled value */
protected GeometricObject(String color, boolean filled) {
dateCreated = new java.util.Date();
this.color = color;
this.filled = filled;
}

/** Return color */
public String getColor() {
return color;
}

/** Set a new color */
public void setColor(String color) {
this.color = color;
}

/** Return filled. Since filled is boolean,
* the get method is named isFilled */
public boolean isFilled() {
return filled;
}

/** Set a new filled */
public void setFilled(boolean filled) {
this.filled = filled;
}

/** Get dateCreated */
public java.util.Date getDateCreated() {
return dateCreated;
}

@Override
public String toString() {
return "created on " + dateCreated + "\ncolor: " + color +
" and filled: " + filled;
}

/** Abstract method getArea */
public abstract double getArea();

/** Abstract method getPerimeter */
public abstract double getPerimeter();
}

class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

}

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side 1 of triangle:");
        double side1 = input.nextDouble();
        System.out.print("Enter side 2 of triangle:");
        double side2 = input.nextDouble();
        System.out.print("Enter side 3 of triangle:");
        double side3 = input.nextDouble();
        System.out.print("Enter color of triangle:");
        String color = input.next();
        System.out.print("Enter whether triangle is filled (yes/no):");
        String filledInput = input.next();
        boolean filled = filledInput.equalsIgnoreCase("yes");

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled?: " + triangle.isFilled());

        input.close();
    }	
}