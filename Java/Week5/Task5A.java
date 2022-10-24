package Java.Week5;

import java.util.Scanner; // Import scanner library

public class Task5A {
    public static void main(String[] args) { // Main function

        try (Scanner input = new Scanner(System.in)) { // Create new scanner object

            System.out.print("Please enter a year: "); // Ask for user input
            int userYear = input.nextInt();

            if (isLeapYear(userYear) == true) { // Call the method "isLeapYear" and check if it returns true or false
                System.out.println("Year " + userYear + " is a leap year!");

            } else {
                System.out.println("Year " + userYear + " is not a leap year.");
            }

        } catch (Exception e) {     // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("\nPlease enter a valid number.");
        } 
    }

    public static Boolean isLeapYear (int year) { // isLeapYear function that returns boolean expression
        return (year % 400 == 0) || ( (year % 4 == 0) && (year % 100 !=0 ));
    }
}
