package Java.Week5;

import java.util.Scanner; // Import scanner library

public class Task5B {
    public static void main(String[] args) { // Main function

        try (Scanner input = new Scanner(System.in)) { // Create new scanner object

            System.out.print("Enter two numbers with a space between them (Example input: 10 25): "); // Ask for user input
            double num1 = input.nextDouble();
            double num2 = input.nextDouble();

            System.out.println(getMax(num1, num2) + " is bigger."); // Call the method "getMax" and print the result
        }
    }

    public static double getMax(double x, double y) { // Compare inputted numbers and return the bigger one
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}
