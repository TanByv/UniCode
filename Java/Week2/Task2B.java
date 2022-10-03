package Java.Week2;

import java.util.Scanner;

public class Task2B {
    public static void main(String[] args) {

        // Set the default value for the amount of Turkish Liras
        int DefaultTRY = 200;

        // Set the exchange prices for ten different currencies. These are the top 10 traded currencies in 10/02/2022
        double USD = 18.5033 ;
        double EUR = 18.1397 ;
        double JPY = 0.127842 ;
        double GBP = 20.6651 ;
        double AUD = 11.8623 ;
        double CAD = 13.3729 ;
        double CHF = 18.7447 ;
        double CNY = 2.60154 ;
        double HKD = 2.35715 ;
        double NZD = 10.3518 ;

        // Create the scanner input and ask user for their input
        try (Scanner input = new Scanner (System.in)) {
            System.out.println("Please specify the amount of Turkish Lira(s) or leave the field empty for the default value (200 TRY):");

            String UserInput = input.nextLine();    // Create a string for writing the user input into. This is for detecting empty input

            if (UserInput == "") {  // Code for empty input 
                
                System.out.println();
                System.out.println("American Dollar (USD) Conversion: " + DefaultTRY/USD);
                System.out.println();
                System.out.println("Euro (EUR) Conversion: " + DefaultTRY/EUR);
                System.out.println();
                System.out.println("Japanese Yen (JPY) Conversion: " + DefaultTRY/JPY);
                System.out.println();
                System.out.println("British Pound (GBP) Conversion: " + DefaultTRY/GBP);
                System.out.println();
                System.out.println("Australian Dollar (AUD) Conversion: " + DefaultTRY/AUD);
                System.out.println();
                System.out.println("Canadian Dollar (CAD) Conversion: " + DefaultTRY/CAD);
                System.out.println();
                System.out.println("Swiss Franc (CHF) Conversion: " + DefaultTRY/CHF);
                System.out.println();
                System.out.println("Chinese Yuan (CNY) Conversion: " + DefaultTRY/CNY);
                System.out.println();
                System.out.println("Hong Kong Dollar (HKD) Conversion: " + DefaultTRY/HKD);
                System.out.println();
                System.out.println("New Zealand Dollar (NZD) Conversion: " + DefaultTRY/NZD);

            } else {    // Code for non empty input

                double UserTRY = Double.valueOf(UserInput);
                System.out.println();
                System.out.println("American Dollar (USD) Conversion: " + UserTRY/USD);
                System.out.println();
                System.out.println("Euro (EUR) Conversion: " + UserTRY/EUR);
                System.out.println();
                System.out.println("Japanese Yen (JPY) Conversion: " + UserTRY/JPY);
                System.out.println();
                System.out.println("British Pound (GBP) Conversion: " + UserTRY/GBP);
                System.out.println();
                System.out.println("Australian Dollar (AUD) Conversion: " + UserTRY/AUD);
                System.out.println();
                System.out.println("Canadian Dollar (CAD) Conversion: " + UserTRY/CAD);
                System.out.println();
                System.out.println("Swiss Franc (CHF) Conversion: " + UserTRY/CHF);
                System.out.println();
                System.out.println("Chinese Yuan (CNY) Conversion: " + UserTRY/CNY);
                System.out.println();
                System.out.println("Hong Kong Dollar (HKD) Conversion: " + UserTRY/HKD);
                System.out.println();
                System.out.println("New Zealand Dollar (NZD) Conversion: " + UserTRY/NZD);
            } 

        } catch (Exception e) {     // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println();
            System.out.println("Please enter a valid number.");
        }
    }
}
