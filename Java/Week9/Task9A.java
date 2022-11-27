package Java.Week9;

import java.util.Scanner;

public class Task9A {
    public static void main(String[] args) {
        
		try (Scanner input = new Scanner(System.in)) {      // Take user input
            System.out.print("Please enter a number: ");
            int userNum = input.nextInt();

            if (isPerfect(userNum) == true) {   // Pass the user input to the isPerfect function and check if it returns true

                System.out.println("\n" + userNum + " is a perfect number!");

            } else {
                
                System.out.println("\n" + userNum + " isn't a perfect number");
            }

        } catch (Exception e) { // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("\nPlease enter a valid number.");
        } 
    }

    public static Boolean isPerfect (int Number) {
		int i;
        int Sum = 0;

		for(i = 1; i < Number; i++) {   // Find the multipliers of the inputted number
			if(Number % i == 0)  {
				Sum = Sum + i;      // Take the sum of the unique multipliers
			}
		}

		if (Sum == Number) {    // Check if the unique multipliers add up to the original number
			return true;
		}
		else {
			return false;
		}
	}
}
