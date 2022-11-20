package Java.Week8;

import java.util.Scanner;

public class Labworks7 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please specify the amount of rows to be created: "); // Take user input and set it as userRows

            int userRows = input.nextInt();
            int rowCounter = 1; // Number of rows, starts from 1
            
            for (int i = userRows; i > 0; i--) {
   
                for (int a = rowCounter-1; a > 0 ; a--) { // Part 1: Print 1 less of the row number as spaces, 1 less because I started row count from 1 
                    System.out.print(" ");
                }
   
                for (int b = rowCounter; b <= userRows; b++) { // Part 2: Print the numbers from the start (1) until user input, each new line increments the starting point
                    System.out.print(b);
                }
   
                for (int c = userRows-1; c >= rowCounter; c--) { // Part 3: Print Part 2 in reverse without including the ending of it
                    System.out.print(c);
                }
   
                for (int d = (rowCounter*2)-1; d >= 1; d--) { // Part 4: Print 1 less of twice the row number as stars
                    System.out.print("*");
                }

                System.out.println(); // Create a new line
                rowCounter += 1; // Increment the row number
            }

        } catch (Exception e) { // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("\nPlease enter a valid number.");
        } 
    }
}
