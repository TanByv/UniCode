package Java.Week3;

import java.util.Scanner;
public class Labworks2 { 
    public static void main(String[] args) {
     
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter the take off speed (m/s) and the acceleration (m/s^2) by leaving a space between them: ");  // Promt user for input

            double Speed = input.nextDouble();  // Take both inputs at the same time
            double Accel = input.nextDouble();

            double Runway = (Speed*Speed)/(2*Accel);    // Calculate the runway length in meters

            System.out.print("The minimum runway length is ");  // Print the result while limiting the number printed to only 2 digits after the dot.
            System.out.printf("%.2f", Runway);
            System.out.print(" meters.");

        } catch (Exception e) { // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("Please enter a valid number.");
        } 
    }
}
