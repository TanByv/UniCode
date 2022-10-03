package Java.Week2;

import java.util.Scanner;

public class Task2C {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please choose your input unit: \n [1] Miliseconds \n [2] Seconds \n [3] Minutes \n [4] Hours \n [5] Days");     // "\n" creates a new line

            int UnitType = input.nextInt();     // Take first input and set it as the unit type. This can range from 1 to 5

            if (!(UnitType >= 1 && UnitType <= 5)) {
                
                System.out.println("\nPlease choose an valid option. Accepted range: 1 to 5");    // Error out if the input isn't an number from 1 to 5
                System.exit(0);

            } else {

                System.out.println("\nPlease enter the amount of the unit you chose:");
            }

            double RawInput = input.nextDouble();   // Now take the actual amount of the unit specified. Example: 10.75 hours
            double CalcInput = 0;                   // Create the double variable here so it can be accessed in the if statements

            if (UnitType == 1) {    // Milliseconds
                
                CalcInput = RawInput;

            } else if (UnitType == 2) {     // Seconds to Milliseconds
                
                CalcInput = RawInput * 1000;

            } else if (UnitType == 3) {     // Minutes to Milliseconds
                
                CalcInput = RawInput * 60000;

            } else if (UnitType == 4) {     // Hours to Milliseconds
                
                CalcInput = RawInput * 3600000;

            } else {     // Days to Milliseconds
                
                CalcInput = RawInput * 86400000;
            }

            double FinalMilliseconds = CalcInput % 1000;
            double FinalSeconds = ((CalcInput - FinalMilliseconds) / 1000) % 60;
            double FinalMinutes = ((CalcInput - (FinalMilliseconds + (FinalSeconds * 1000))) / 60000) % 60;
            double FinalHours = ((CalcInput - (FinalMilliseconds + (FinalSeconds * 1000) + (FinalMinutes * 60000))) / 3600000) % 24;
            double FinalDays = ((CalcInput - (FinalMilliseconds + (FinalSeconds * 1000) + (FinalMinutes * 60000) + (FinalHours * 3600000))) / 86400000);

            System.out.println("\nDay(s): " + FinalDays + "\nHour(s): " + FinalHours + "\nMinute(s): " + FinalMinutes + "\nSecond(s): " + FinalSeconds + "\nMillisecond(s): " + FinalMilliseconds);
    

        } catch (Exception e) {     // Catching the exception to prevent crash in case of input not being a valid number
            System.out.println("\nPlease enter a valid number.");
        } 
    }
}
