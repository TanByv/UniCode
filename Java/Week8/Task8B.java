package Java.Week8;

import java.util.Scanner;

public class Task8B {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int userInput = input.nextInt();

            if (isPrime(userInput) == true) {
                
                System.out.println("Number entered is a prime number.");
            } else {
                
                System.out.println("Number entered is not a prime number.");
            }

        } catch (Exception e) { // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("\nPlease enter a valid number.");
        } 
    }

    static boolean isPrime(int num) {

        if (num < 2)
            return false;
  
        for (int i = 2; i < num; i++) // Set i as 2 and if increment 1 until it's equal or bigger than the input
            if (num % i == 0)
                return false;
  
        return true;
    }
}