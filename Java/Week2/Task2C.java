package Java.Week2;

import java.util.Scanner;

public class Task2C {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please choose your input unit: \n [1] Miliseconds \n [2] Seconds \n [3] Minutes \n [4] Hours \n [5] Days");

            int UnitType = input.nextInt();

            System.out.println();
            System.out.println("Please enter the amount of the unit you chose:");

            double RawInput = input.nextDouble();
            double CalcInput = 0;

            if (UnitType == 1) {    // Milliseconds
                
                CalcInput = RawInput;

            } else if (UnitType == 2) {     // Seconds to Milliseconds
                
                CalcInput = RawInput * 1000;

            } else if (UnitType == 3) {     // Minutes to Milliseconds
                
                CalcInput = RawInput * 60000;

            } else if (UnitType == 4) {     // Hours to Milliseconds
                
                CalcInput = RawInput * 3600000;

            } else if (UnitType == 5) {     // Days to Milliseconds
                
                CalcInput = RawInput * 86400000;

            } else {
                
                System.out.println("Choose a valid option. Example; 2");

            }

            double FinalMilliseconds = CalcInput % 1000;
            double FinalSeconds = (CalcInput / 1000) % 60;
            double FinalMinutes = (CalcInput / 60000) % 60;
            double FinalHours = (CalcInput / 3600000) % 24;
            double FinalDays = (CalcInput / 86400000);

            System.out.println();
            System.out.println("Day(s): " + FinalDays + "\nHour(s): " + FinalHours + "\nMinute(s): " + FinalMinutes + "\nSecond(s): " + FinalSeconds + "\nMillisecond(s): " + FinalMilliseconds);
        }
    }
}
