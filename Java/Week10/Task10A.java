package Java.Week10;

import java.util.Scanner;

public class Task10A {
    public static void main(String[] args) {
        
        int[] hahaXD = new int[20];   // Create an array named hahaXD with lenght of 20 and data type set to integer as requested

        try (Scanner input = new Scanner(System.in)) {

            for (int i = 0; i < hahaXD.length; i++) {   // For loop to enter data to each index available

                System.out.print("Enter number lol: ");
                hahaXD[i] = input.nextInt();
            }
        }

        for (int i = 0; i < hahaXD.length; i++) {   // For loop to print values of all indexes in 

            System.out.print(hahaXD[i] + " ");
        }
    }
}
