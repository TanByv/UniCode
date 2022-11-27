package Java.Week9;

import java.util.Scanner;

public class Task9C {
    public static void main(String[] args) {
        
		try (Scanner input = new Scanner(System.in)) {      // Take user input
            System.out.print("Please enter a number: ");
            int userNum = input.nextInt();

            if (isPerfect(userNum) == true) {   // Pass the user input to the isPerfect function and check if it returns true

                System.out.println("\n" + userNum + " is a armstrong number!");

            } else {
                
                System.out.println("\n" + userNum + " isn't a armstrong number");
            }

        } catch (Exception e) { // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("\nPlease enter a valid number.");
        } 
    }

    public static Boolean isPerfect (int num) {
        int sum = 0;
        int rem = 0;
        int numOrg = num;

        while (num != 0) {  // Find each digit and take the cube of it and add it to the sum
            rem = num % 10;
            sum += rem * rem * rem;
            num = num / 10;
        }
    

		if (numOrg == sum) {    // Check if the cube of each digit add up to the original number
			return true;
		}
		else {
			return false;
		}
	}
}
