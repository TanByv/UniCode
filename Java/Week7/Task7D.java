package Java.Week7;

import java.util.Scanner;
public class Task7D {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter lower limit: "); // Take lower limit
            int lowerL = input.nextInt();
            System.out.print("Enter upper limit: "); // Take upper limit
            int upperL = input.nextInt();
            System.out.print("Enter the increment: "); // Take the increment
            int increment = input.nextInt();
            
            System.out.println("Answer: " + (sumUp(lowerL, upperL, increment))); // Call the function using using user inputs

        }  catch (Exception e) { // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("\nPlease enter a valid number.");
        } 
    }
    
    public static int sumUp(int num1, int num2, int num3) {
        int sum = 0;

        while ((num1 <= num2)) { // If num1 is equal or smaller than num2 keep doing the loop
            sum += num1;
            num1 += num3;
        }
        return sum;
    }
}
