package Java.Week4;

import java.util.Scanner;

public class Labworks3 {
    public static void main(String[] args) {
        
        double circleCenterX = 0;   // Define default values
        double circleCenterY = 0;

        double circleRadius = 4;

        double rectangleCenterX = -1;
        double rectangleCenterY = 0;

        double rectangleWidth = 8;
        double rectangleHeight = 4;


        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Choose operating mode:\n [1] Use default values\n [2] Specify new values"); // Ask user for operation mode

            int operationMode = input.nextInt();

            if (operationMode == 1) {   // Intended mode, use default values
                
                System.out.println("\nUsing default values:\n Circle: Radius = 4, Center Point = (0,0)\n Rectangle: Width = 8, Height = 4, Center Point = (-1,0)");

            } else if (operationMode == 2) {    // Extra mode, user specifies all values
                
                System.out.print("\nEnter the coordinates for circle's center point (Example input: -1 5): ");  // Set circle center point using
                circleCenterX = input.nextDouble();
                circleCenterY = input.nextDouble();

                System.out.print("\nEnter a radius for the circle: ");  // Set circle radius using
                circleRadius = input.nextDouble();

                System.out.print("\nEnter the coordinates for rectangle's center point (Example input: 5 -3): ");    // Set rectangle center point
                rectangleCenterX = input.nextDouble();
                rectangleCenterY = input.nextDouble();

                System.out.print("\nEnter the width and height in respective order for the rectangle (Example input: 9 4): ");  // Set the dimensions of the rectangle
                rectangleWidth = input.nextDouble();
                rectangleHeight = input.nextDouble();

            } else {

                System.out.print("Please select a valid operation mode.");    // Valid operation modes are 1 and 2. Rest exits the program
                System.exit(0);
            }

            System.out.print("\nEnter your desired coordinates for them to be checked if they're both inside the circle and the rectangle (Example input: 2 -1): "); // User inputs coordinates for calculation
            double userCoordX = input.nextDouble();
            double userCoordY = input.nextDouble();

            double furthestPositiveX = (rectangleCenterX + (rectangleWidth / 2));   // Calculate furthest possible X values for both positive X and negative X directions.
            double furthestNegativeX = (rectangleCenterX - (rectangleWidth / 2));

            double furthestPositiveY = (rectangleCenterY + (rectangleHeight / 2));  // Calculate furthest possible Y values for both positive Y and negative Y directions
            double furthestNegativeY = (rectangleCenterY - (rectangleHeight / 2));

            if ((furthestPositiveX >= userCoordX && userCoordX >= furthestNegativeX) && (furthestPositiveY >= userCoordY && userCoordY >= furthestNegativeY)) { // Rectangle test passes

                if (Math.sqrt(Math.pow(userCoordX - circleCenterX, 2) + Math.pow(userCoordY - circleCenterY, 2)) <= circleRadius) { // Both tests passed
                    
                    System.out.print("Point (" + userCoordX + ", " + userCoordY + ") is in the region!");

                } else { // Circle test fails

                    System.out.print("Point (" + userCoordX + ", " + userCoordY + ") is NOT in the region.");
                }

            } else {    // Rectangle test fails

                System.out.print("Point (" + userCoordX + ", " + userCoordY + ") is NOT in the region."); 
            }

        }  catch (Exception e) { // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("Please enter a valid number.");
        }   
    }
}
