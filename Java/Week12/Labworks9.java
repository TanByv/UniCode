package Java.Week12;

import java.util.Scanner; // import Scanner class to read user input via console
import java.util.Arrays; // import Arrays class to use its toString method

// The program reads the corner point coordinates of a triangle from the user,
// computes the side lengths of the triangle from its corner point coordinates,
// and computes then prints the area of the triangle using the Heron's formula.
// Three helper methods are written and used in the program.
public class Labworks9 {
    public static void main(String[] args) {
        // create a 2-D array for the corner point coordinates of the triangle
        // 3 corner points -> 3 rows and 2 coordinates (x and y) -> 2 columns
        double[][] cornerPoints = new double[3][2];

        // prompt the user to enter the corner point coordinates for a triangle
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the corner points as x1 y1 x2 y2 x3 y3: ");

        // read the user entered information into the 2-D array cornerPoints
        for (int i = 0; i < cornerPoints.length; i++) // for each corner point
            for (int j = 0; j < cornerPoints[i].length; j++) // read x and y
                cornerPoints[i][j] = input.nextDouble();
        input.close();

        // print the user-entered corner point coordinates on the console
        for (int i = 1; i <= cornerPoints.length; i++) { // for each corner point

            // create a 1-D array for the point (a demonstration of array of arrays:
            // a 2-D array is a 1-D array in which each element is another 1-D array)
            double[] point = cornerPoints[i - 1];

            // print the coordinates of the point using the Arrays.toString method
            System.out.print("x and y coordinates for corner point " + i + ": ");
            System.out.println(Arrays.toString(point));
        }

        // compute the side lengths of the triangle by using the computeSideLengths
        // method for the corner point coordinates stored as cornerPoints
        double[] sides = computeSideLengths(cornerPoints);

        // print the computed side lengths by using the Arrays.toString method
        System.out.println("Computed side lenghts: " + Arrays.toString(sides));

        // compute and print the area of the triangle based on the Heron's formula
        // by using the computeArea method for the side lengths stored as sides
        double area = computeArea(sides);
        System.out.println("The area of the triangle is " + area + ".");
    }

    // A method that computes and returns the Euclidean distance between 2 points
    // whose coordinates are given as the input parameters.
    public static double distance(double[] point1, double[] point2) {
        // Compute the Euclidean distance
        double sum = 0;
        for (int i = 0; i < point1.length; i++) {
            double difference = point1[i] - point2[i];
            sum += difference * difference;
        }
        return Math.sqrt(sum);
    }

    // A method that computes the side lengths of a triangle, stores the result
    // in an array and returns the array. The corner points of the triangle are
    // given to the method as an input parameter which is a 2-D array.
    public static double[] computeSideLengths(double[][] cornerPoints) {
        // Compute the side lengths of the triangle
        double[] sideLengths = new double[3];
        sideLengths[0] = distance(cornerPoints[0], cornerPoints[1]);
        sideLengths[1] = distance(cornerPoints[1], cornerPoints[2]);
        sideLengths[2] = distance(cornerPoints[2], cornerPoints[0]);
        return sideLengths;
    }

    // A method that computes and returns the area of the triangle whose side
    // lengths are given as the input parameter which is an array.
    public static double computeArea(double[] sideLengths) {
        // Compute the semi-perimeter of the triangle
        double s = (sideLengths[0] + sideLengths[1] + sideLengths[2]) / 2;

        // Compute the area of the triangle using Heron's formula
        double area = Math.sqrt(s * (s - sideLengths[0]) * (s - sideLengths[1]) * (s - sideLengths[2]));
        return area;
    }
}