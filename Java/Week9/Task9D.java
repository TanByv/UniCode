package Java.Week9;

import java.util.Scanner;

public class Task9D {
    public static void main(String[] args) {
                
		try (Scanner input = new Scanner(System.in)) {      // Take user input
            System.out.print("Please enter a number: ");
            int userNum = input.nextInt();

            if (isNarcissistic(userNum) == true) {   // Pass the user input to the isPerfect function and check if it returns true

                System.out.println("\n" + userNum + " is a narcissistic number!");

            } else {
                
                System.out.println("\n" + userNum + " isn't a narcissistic number");
            }

        } catch (Exception e) { // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("\nPlease enter a valid number.");
        } 
    }

    public static Boolean isNarcissistic (int num) {
        if (num < 0) {
            return false;
        }
        
        int digitCount = digitCounter(num);
        int sum = 0;
        int rem = 0;
        int numOrg = num;
        int remTot;

        while (num != 0) {
            rem = num % 10;
            remTot = 1;

            for (int i = 1; i <= digitCount; i++) // Use the digit time to take power
                remTot *= rem;

            sum += remTot;
            num = num / 10;
        }

        if (sum == numOrg) {
            return true;

        } else {
            return false;
        }
    }
    
    public static int digitCounter (int num) { // Find the digit count of the user input
        int counter = 0;

        if (num == 0) {
            return 1;

        } else {

            while (num != 0) {
                num = num / 10;
                counter++;
            }

        return counter;
        }
    }
}