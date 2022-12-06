package Java.Week10;

import java.util.Scanner;

public class Task10A {
    public static void main(String[] args) {
        
        int[] hahaXD = new int[20];   // Create an array named hahaXD with length of 20 and data type set to integer as requested

        try (Scanner input = new Scanner(System.in)) {

            for (int i = 0; i < hahaXD.length; i++) {   // For loop to enter data to each index available

                System.out.print("Enter number lol: ");
                hahaXD[i] = input.nextInt();
            }

        } catch (Exception e) { // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("\nPlease enter a valid number.");
        } 

        for (int i = 0; i < hahaXD.length; i++) {   // For loop to print values of all indexes

            System.out.print(hahaXD[i] + " ");
        }
    }
}
