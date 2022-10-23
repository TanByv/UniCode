package Java.Week5;

import java.util.Scanner;

public class Labworks4 {
    public static void main(String[] args) {
        
        System.out.println(" __   __  _______  _______  __   __    _______  __   __  ___   _______ ");
        System.out.println("|  |_|  ||   _   ||       ||  | |  |  |       ||  | |  ||   | |       |");
        System.out.println("|       ||  |_|  ||_     _||  |_|  |  |   _   ||  | |  ||   | |____   |");
        System.out.println("|       ||       |  |   |  |       |  |  | |  ||  |_|  ||   |  ____|  |");
        System.out.println("|       ||       |  |   |  |       |  |  |_|  ||       ||   | | ______|");
        System.out.println("| ||_|| ||   _   |  |   |  |   _   |  |      | |       ||   | | |_____ ");
        System.out.println("|_|   |_||__| |__|  |___|  |__| |__|  |____||_||_______||___| |_______|");

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("\n[1] Addition\n[2] Subtraction\n[3] Multiplication\n[4] Division\nPlease select the type of question you want: ");
            int quizMode = input.nextInt(); 

            int num1 = (int)(Math.random() * 9 + 1);    // Generate two random numbers between 1 and 9
            int num2 = (int)(Math.random() * 9 + 1);

            int correctAnswer = 0;  // Define correct answer

            switch (quizMode) {
                case 1: // Addition
                    correctAnswer = num1 + num2; // Set the correct answer using Addition
                    System.out.print("\nWhat is " + num1 + " + " + num2 + "?: ");    // Ask user for input with the correct sign
                    break;
                case 2: // Subtraction
                    correctAnswer = num1 - num2; // Set the correct answer using Subtraction
                    System.out.print("\nWhat is " + num1 + " - " + num2 + "?: ");    // Ask user for input with the correct sign
                    break;
                case 3: // Multiplication
                    correctAnswer = num1 * num2; // Set the correct answer using Multiplication
                    System.out.print("\nWhat is " + num1 + " * " + num2 + "?: ");    // Ask user for input with the correct sign
                    break;
                case 4: // Division
                    while (!(num1 % num2 == 0)) {   // While loop to generate a combination of randomly generated number that would fully divide
                        num1 = (int)(Math.random() * 9 + 1);
                        num2 = (int)(Math.random() * 9 + 1);
                    }
                    correctAnswer = num1 / num2; // Set the correct answer using Division
                    System.out.print("\nWhat is " + num1 + " / " + num2 + "?: ");    // Ask user for input with the correct sign
                    break;
            }
            
            int userAnswer = input.nextInt();

            if (userAnswer == correctAnswer) {  // Check if answer is correct and print result
                System.out.println("Congratulations, your answer is correct!");

            } else {
                System.out.println("Your answer is wrong, correct answer was: " + correctAnswer);
            }

        } catch (Exception e) {     // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("\nPlease enter a valid number.");
        } 
    }
}
