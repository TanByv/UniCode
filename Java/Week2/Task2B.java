package Java.Week2;

import java.util.Scanner;

public class Task2B {
    public static void main(String[] args) {

        // Set the default value for the amount of Turkish Liras
        int DefaultTRY = 200;

        // Set the exchange prices for ten different currencies. These are the top 10 traded currencies in 3/10/2022
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
                
                System.out.println("American Dollar (USD) Conversion: " + DefaultTRY/USD + "\n");
                System.out.println("Euro (EUR) Conversion: " + DefaultTRY/EUR + "\n");
                System.out.println("Japanese Yen (JPY) Conversion: " + DefaultTRY/JPY + "\n");
                System.out.println("British Pound (GBP) Conversion: " + DefaultTRY/GBP + "\n");
                System.out.println("Australian Dollar (AUD) Conversion: " + DefaultTRY/AUD + "\n");
                System.out.println("Canadian Dollar (CAD) Conversion: " + DefaultTRY/CAD + "\n");
                System.out.println("Swiss Franc (CHF) Conversion: " + DefaultTRY/CHF + "\n");
                System.out.println("Chinese Yuan (CNY) Conversion: " + DefaultTRY/CNY + "\n");
                System.out.println("Hong Kong Dollar (HKD) Conversion: " + DefaultTRY/HKD + "\n");
                System.out.println("New Zealand Dollar (NZD) Conversion: " + DefaultTRY/NZD + "\n");

            } else {    // Code for non empty input

                double UserTRY = Double.valueOf(UserInput);
                System.out.println("\nAmerican Dollar (USD) Conversion: " + UserTRY/USD + "\n");
                System.out.println("Euro (EUR) Conversion: " + UserTRY/EUR + "\n");
                System.out.println("Japanese Yen (JPY) Conversion: " + UserTRY/JPY + "\n");
                System.out.println("British Pound (GBP) Conversion: " + UserTRY/GBP + "\n");
                System.out.println("Australian Dollar (AUD) Conversion: " + UserTRY/AUD + "\n");
                System.out.println("Canadian Dollar (CAD) Conversion: " + UserTRY/CAD + "\n");
                System.out.println("Swiss Franc (CHF) Conversion: " + UserTRY/CHF + "\n");
                System.out.println("Chinese Yuan (CNY) Conversion: " + UserTRY/CNY + "\n");
                System.out.println("Hong Kong Dollar (HKD) Conversion: " + UserTRY/HKD + "\n");
                System.out.println("New Zealand Dollar (NZD) Conversion: " + UserTRY/NZD + "\n");
            } 

        } catch (Exception e) {     // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("\nPlease enter a valid number.");
        }
    }
}
