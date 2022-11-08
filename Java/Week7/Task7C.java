package Java.Week7;

public class Task7C {
    public static void main(String[] args) {
        int i = 0; // Define counter variable
        while (i < 3) { // Start while loop if counter is less than 3
            int r1 = (int)(Math.random() * (15 - 3)) + 3; // Generate number between 15 and 3
            System.out.println(r1 + "! = " + factorial(r1) + "\n"); // Print the factorial and it's solution
            i++;
        }
    }

    public static int factorial (int num) { // Fucntion for calculating factorial
        int product = 1;

        while (num != 1) {  // if num isn't equal to 1, do this in a loop
            product = product * num;
            num = num - 1;
        }
        return product;
    }
}