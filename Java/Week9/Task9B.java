package Java.Week9;

import java.util.Scanner;

public class Task9B {
    public static void main(String[] args) {
        
		try (Scanner input = new Scanner(System.in)) {      // Take user input
            System.out.print("Please enter a number: ");
            int userNum = input.nextInt();

            System.out.println("\n" + sumOfDigits(userNum) + " is the sum the digits.");

        } catch (Exception e) { // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("\nPlease enter a valid number.");
        }   
    }

    public static int sumOfDigits ( int num ) { 
        int sum = 0;

        while (num!=0) {      // Find the digit and divide by 10 to process the next digit, repeat until last digit
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
    
}
