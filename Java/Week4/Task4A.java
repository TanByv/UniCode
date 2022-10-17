package Java.Week4;

import java.util.Scanner;

public class Task4A {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter number xd: ");
             
            int userNum = input.nextInt();

            if ((userNum % 400 == 0) || ((userNum % 4 == 0) && (userNum % 100 != 0))) { // Check if year is divisible by 400 or divisible by 4 but not by 100
                
                System.out.println("Year " + userNum + " is a leap year!"); // Test Passes

            } else {

                System.out.println("Year " + userNum + " is not a leap year!"); // Test Fails
            }

        }  catch (Exception e) { // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("Please enter a valid number.");
        }   
    }
}
