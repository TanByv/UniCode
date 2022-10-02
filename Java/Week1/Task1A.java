package Java.Week1;

import java.util.Scanner;
 
public class Task1A {
  public static void main(String[] args) 
  {
    try (Scanner input = new Scanner (System.in)) {
        System.out.print("Input the first number: ");
        int num1 = input.nextInt();
        System.out.print("Input the second number: ");
        int num2 = input.nextInt();
        System.out.print("Input the third number: ");
        int num3 = input.nextInt();
        int sum = num1 + num2 * num3;
        System.out.println();
        System.out.println("Sum: "+sum);
    }
  }
}