package Java.Week8;

import java.util.Scanner;

public class Task8C {

    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Which term of the fibonacci sequence would you like to know?: ");
            int XD = input.nextInt();
            
            System.err.println(fibonacciNth(XD));

        } catch (Exception e) { // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("\nPlease enter a valid number.");
        } 
    }

    public static int fibonacciNth (int num) { 
        int f1 = 0;
        int f2 = 1;
        int temp;
        for (int i = 0; i < num-1; i++) { // Execute the calculations for every i that is smaller than 1 less of the input
            temp = f1;
            f1 = f2;
            f2 = f1 + temp;
        }
        return f1;
    }
}
