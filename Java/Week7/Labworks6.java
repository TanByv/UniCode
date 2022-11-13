package Java.Week7;

import java.util.Scanner;

public class Labworks6 {
    
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {  // Take user input
            System.out.print("Please enter a positive integer: ");
            int userInput = input.nextInt();

            if (userInput >= 0) {   // Check if user input is positive integer
                if (isPalindrome(userInput) == true) {  // Call the isPalindrome function and check if it returns true or not
                    System.out.println(userInput + " is palindromic.");
                } else {
                    System.out.println(userInput + " is not palindromic.");
                }

            } else {
                
                System.out.println("Invalid input, only positive integers are allowed");    // Positive integer check fails
            }

        } catch (Exception e) {     // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("\nPlease enter a valid number.");
        } 
    }

    public static int reverseNumber(int num) {

        int number = num;
        int reverse = 0;

        while (number != 0) { // If number isn't equal to 0, keep looping
            int remainder = number % 10;    // Implementation of the example given in the handout
            reverse = reverse * 10 + remainder;
            number = number/10;
        }

        return reverse;
    }

    public static boolean isPalindrome(int num1) {  // Check if input is the same as it's reverse
        
        if (num1 == reverseNumber(num1)) {
            return true;
        } else {
            return false;
        }
    }
}
