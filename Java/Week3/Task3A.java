package Java.Week3;

import java.util.Scanner;
public class Task3A {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter a numerical grade between 0 and 105: ");    // Ask user for input

            double NumGrade = input.nextDouble();

            if (0 <= NumGrade && NumGrade < 50) {   // Compare given grade to set values to figure out the letter grade
                
                System.out.println("Grade entered equals to F");

            } else if (50 <= NumGrade && NumGrade < 55) {

                System.out.println("Grade entered equals to D");  

            } else if (55 <= NumGrade && NumGrade < 60) {

                System.out.println("Grade entered equals to D+");  

            } else if (60 <= NumGrade && NumGrade < 65) {

                System.out.println("Grade entered equals to C-"); 

            } else if (65 <= NumGrade && NumGrade < 70) {

                System.out.println("Grade entered equals to C");

            } else if (70 <= NumGrade && NumGrade < 75) {

                System.out.println("Grade entered equals to C+");  

            } else if (75 <= NumGrade && NumGrade < 80) {

                System.out.println("Grade entered equals to B-"); 

            } else if (80 <= NumGrade && NumGrade < 85) {

                System.out.println("Grade entered equals to B"); 

            } else if (85 <= NumGrade && NumGrade < 90) {

                System.out.println("Grade entered equals to B+"); 

            } else if (90 <= NumGrade && NumGrade < 95) {

                System.out.println("Grade entered equals to A-"); 

            } else if (95 <= NumGrade && NumGrade <= 105) {

                System.out.println("Grade entered equals to A"); 

            } else {

                System.out.println("Number entered is out of range. Please only enter a number between 0 and 105.");
            }

        } catch (Exception e) { // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("Please enter a valid number.");
        }       
    }
}
