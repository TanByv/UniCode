package Java.Week14;

public class Task14B {
    public static void main(String[] args) {
        // Question: Use nested for loops to print out all possible combinations of numbers from 1 to 3

        // Answer: The outer loop will iterate over the numbers 1 to 3 and the inner loop will iterate over the same numbers when the first one is done
        
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
