package Java.Week11;

import java.util.Scanner;

public class Task11B {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // Create a double 3D array with dimensions 2, 3, and 2
            double[][][] crazyArray = new double[2][3][2];

            // Prompt the user
            System.out.print("Enter 12 double values seperated by commas: ");

            // Use a nested loop to read the input and populate the array
            for (int i = 0; i < crazyArray.length; i++) {
                for (int j = 0; j < crazyArray[i].length; j++) {
                    for (int k = 0; k < crazyArray[i][j].length; k++) {

                        // Read the next double from the user and store it in the array
                        crazyArray[i][j][k] = input.nextDouble();
                    }
                }
            }

            System.out.println("\nHere is the array created with your specified values:");

            // Print the entire array
            for (int i = 0; i < crazyArray.length; i++) {
                for (int j = 0; j < crazyArray[i].length; j++) {
                    for (int k = 0; k < crazyArray[i][j].length; k++) {
                        
                        System.out.print(crazyArray[i][j][k] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }

        } catch (Exception e) { // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("\nPlease enter a valid number.");
        }
    }
}
