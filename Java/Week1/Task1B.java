package Java.Week1;

import java.util.Scanner;
 
public class Task1B {
  public static void main(String[] args) 
  {
    try (Scanner input = new Scanner (System.in)) {
        System.out.print("Input your first name: ");
        String fname = input.next();
        System.out.print("Input your last name: ");
        String lname = input.next();
        System.out.println();
        System.out.println("Hello, "+fname+" "+lname);
    }
  }
}