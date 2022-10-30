package Java.Week6;

import java.util.Scanner;

public class Labworks5 {
    public static void main(String[] args) {
        System.out.println(" _______  ______    ___   _______  __    _  _______  ___      _______  _______ \n|       ||    _ |  |   | |   _   ||  |  | ||       ||   |    |       ||       |\n|_     _||   | ||  |   | |  |_|  ||   |_| ||    ___||   |    |    ___||  _____|\n  |   |  |   |_||_ |   | |       ||       ||   | __ |   |    |   |___ | |_____ \n  |   |  |    __  ||   | |       ||  _    ||   ||  ||   |___ |    ___||_____  |\n  |   |  |   |  | ||   | |   _   || | |   ||   |_| ||       ||   |___  _____| |\n  |___|  |___|  |_||___| |__| |__||_|  |__||_______||_______||_______||_______|\n");

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter the length for each side of the triangle (Example input - 3 4 5): ");    // Promt the user for input
            
            int side1 = input.nextInt();    // Take user input for all three sides of the triangle
            int side2 = input.nextInt();
            int side3 = input.nextInt();

            if (isValid(side1, side2, side3) == true) {
                System.out.println("\nThe perimeter of this triangle is " + getPerimeter(side1, side2, side3));   // Print the perimeter if isValid Function passed
                System.out.print("The area of this triangle is ");  // Print the Area if isValid Function passed
                System.out.printf("%.2f", getArea(side1, side2, side3));    // Format the getArea result to only include two digits after the seperator
            } else {
                System.out.println("\nInvalid triangle.");    // isValid Function failed
            }

        } catch (Exception e) { // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("\nPlease enter a valid number.");
        } 
    }

    public static boolean isValid(int a, int b, int c) {    // Function for checking if the triangle is valid
        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            return true;
        } else {
            return false;
        }
    }

    public static int getPerimeter(int a, int b, int c) {   // Function for the perimeter
        return a + b + c;
    }

    public static double getArea(int a, int b, int c) { // Function for calculating the area
        double s = (a + b + c) / 2; // Calculate "s" for Heron's Formula
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));  // Heron's Formula
    }
}
