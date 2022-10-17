package Java.Week4;

import java.util.Scanner;

public class Task4B {
    public static void main(String[] args) {
        int prizeFull = (int)(Math.random() * 90 + 10); // Type cast [0,1) double type number to integer while expanding the range to 10-99 
        int prize10s = (int)(prizeFull / 10);   // Find the 10s digit of the winning number
        int prize1s = prizeFull % 10;   // Find the 1s digit of the winning number

        System.out.println(" _______  _______  _______  ___   __    _  _______ ");
        System.out.println("|       ||   _   ||       ||   | |  |  | ||       |");
        System.out.println("|      _||  |_|  ||  _____||   | |   |_| ||   _   |");
        System.out.println("|     | ||       || |_____ |   | |       ||  | |  |");
        System.out.println("|     |_ |       ||_____  ||   | |  _    ||  |_|  |");
        System.out.println("|       ||   _   | _____| ||   | | | |   ||       |");
        System.out.println("|_______||__| |__||_______||___| |_|  |__||_______|");

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("\nEnter a number between 10 and 99: "); // Take user input
            int userFull = input.nextInt();

            if (!(10 <= userFull && userFull <= 99)) {
                
                System.out.println("\nPlease only enter a number between 10 and 99.");
                System.exit(0);
            }

            int user10s = (int)(userFull / 10); // Find 10s digit of the user input
            int user1s = userFull % 10; // Find the 1s digit of the user input

            if (prizeFull == userFull) {
                
                System.out.println("\nJackpot! You guessed the winning number correctly!\nYour prize is: $10,000");   // Guess correct

            } else if (prize10s == user1s && prize1s == user10s) {
                
                System.out.println("\nClose! You got the order of digits wrong. Winning number was: " + prizeFull + "\nYour prize is $3,000");  // Guess correct but order wrong

            } else if (prize10s == user10s || prize1s == user1s) {
                
                System.out.println("\nNot quite there. You guessed one of the digits correctly. Winning number was: " + prizeFull + "\nYour prize is $1,500"); // One of the digits is correct

            } else if (prize10s == user1s || prize1s == user10s) {
                
                System.out.println("\nBetter than nothing. You guessed one of the digits correctly but in the wrong spot. Winning number was: " + prizeFull + "\nYour prize is $1,000"); // One of the digits is correct but it's spot is wrong

            } else {

                System.out.println("\nUnlucky! Your guess didn't land on anything. Winning number was: " + prizeFull); // Everything is wrong
            }

        } catch (Exception e) { // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("Please enter a valid number.");
        }  
    }
}
