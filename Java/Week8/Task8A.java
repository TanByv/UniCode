package Java.Week8;

import java.util.Scanner;

public class Task8A {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int XD = input.nextInt();
            
            System.err.println(highestDivisor(XD));

        } catch (Exception e) { // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("\nPlease enter a valid number.");
        } 
    }

    public static int highestDivisor(int num) {
        
        for (int i = num / 2; i >= 2; i--) { // Set i as half of the input and if it's still bigger than 2, subtract 1 from it in a for loop
            if (num % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
