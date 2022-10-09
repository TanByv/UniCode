package Java.Week3;

import java.util.Scanner;
public class Labworks2 { 
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the take off speed (m/s) and the acceleration (m/s^2) by leaving a space between them: ");

        double TakeOff = input.nextDouble();
        double Accel = input.nextDouble();

        System.out.println("DEBUG: " + TakeOff + ", " + Accel);
    }
}
