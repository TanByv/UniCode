package Java.Week4;

import java.util.Scanner;

public class Task4B {
    public static void main(String[] args) {
        
        int prizeFull = (int)(Math.random() * 90 + 10); // Type cast [0,1) double type number to integer while expanding the range to 10-99 
        int prize10s = (int)(prizeFull / 10);   // Find the 10s digit of the winning number
        int prize1s = prizeFull % 10;   // Find the 1s digit of the winning number

        System.out.println(prizeFull + " " + prize10s + " " + prize1s);

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number between 10 and 99: "); // Take user input
            int userFull = input.nextInt();

            int user10s = (int)(userFull / 10); // Find 10s digit of the user input
            int user1s = userFull % 10; // Find the 1s digit of the user input

            if (prizeFull == userFull) {
                
                System.out.println("Jackpot! You guessed the winning number correctly!\nYour prize is: $10,000");   // Guess correct

            } else if (prize10s == user1s && prize1s == user10s) {
                
                System.out.println("Close! You got the order of digits wrong.\nYour prize is $3,000");  // Guess correct but order wrong

            } else if (prize10s == user10s || prize1s == user1s) {
                
                System.out.println("Not quite there. You guessed one of the digits correctly.\nYour prize is $1,500"); // One of the digits is correct

            } else if (prize10s == user1s || prize1s == user10s) {
                
                System.out.println("Better than nothing. You guessed one of the digits correctly but in the wrong spot.\nYour prize is $1,000"); // One of the digits is correct but it's spot is wrong

            } else {

                System.out.println("Unlucky! You guess didn't land on anything."); // Everything is wrong
            }

        } catch (Exception e) { // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("Please enter a valid number.");
        }  
    }
}
