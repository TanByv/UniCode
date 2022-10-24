package Java.Week5;

import java.util.Scanner; // Import scanner library

public class Task5C {
    public static void main(String[] args) { // Main function

        try (Scanner input = new Scanner(System.in)) { // Create new scanner object

            System.out.print("Enter four numbers with a space between them (Example input: 10 25 49 64): "); // Ask for user input
            double num1 = input.nextDouble();
            double num2 = input.nextDouble();
            double num3 = input.nextDouble();
            double num4 = input.nextDouble();

            System.out.println(getMin(getMin(num1, num2),getMin(num3, num4)) + " is the smallest."); // Call the method "getMin" and print the result

        } catch (Exception e) {     // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("\nPlease enter a valid number.");
        } 
    }

    public static double getMin(double x, double y) { // Compare inputted numbers and return the smaller one
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }
}
