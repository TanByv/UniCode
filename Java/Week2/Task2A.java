package Java.Week2;

import java.util.Scanner;

public class Task2A {
    public static void main(String[] args) {

        // Create the scanner object and get the necessary information from user
        try (
        Scanner input = new Scanner(System.in)) {

            System.out.println("Please enter your weight in kilograms: ");
            double weight = input.nextDouble();

            System.out.println("");

            System.out.println("Please enter your height in meters: ");
            double height = input.nextDouble();

            // Calculate the BMI using the formula given and give the user their result
            double bmi = weight / (height*height);
            
            System.out.println("");

            // Limiting the amount of digits after the comma printed. Printing the entire double value causes a long and unpleasant to look at value for the user.  
            System.out.printf("%.2f", bmi);
            System.out.println(" is your BMI score.");

            // Give the user information about what category their BMI score falls under
            if (bmi < 18.5) {

                System.out.println("Your BMI score is considered Underweight.");

            }    else if (18.5 <= bmi && bmi < 25) {

                    System.out.println("Your BMI score is considered Normal Weight.");
            
                } else if (25 <= bmi && bmi < 30) {

                    System.out.println("Your BMI score is considered Overweight.");

                } else {

                    System.out.println("Your BMI score is considered Obese.");

                }

        } catch (Exception e) {     // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("\nPlease enter a valid number.");
        } 
    }
}
