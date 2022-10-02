package Java.Week2;

import java.util.Scanner;

public class Task2B {
    public static void main(String[] args) {

        // Set the default value for the amount of Turkish Liras
        double DefaultTRY = 200;

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

        try (Scanner input = new Scanner (System.in)) {
            System.out.println("Please specify the amount of Turkish Lira(s) or leave the field empty for the default value (200 TRY):");

            String UserInput = input.nextLine();

            if (UserInput == "") {
                
                System.out.println("DEFAULT VALUE: " + DefaultTRY);

            } else {
                try {
                    
                double UserTRY = Double.valueOf(UserInput);
                System.out.println(UserTRY + " YOU PASSED XDXD");

                } catch (Exception e) {
                    System.out.println("Enter a valid number.");
                }
            } 
        }
    }
}
