package Java.Week10;

public class Task10D {
    public static void main(String[] args) {

        // Create a new 100 length array
        int[] omegaArray = new int[100];
        int indexCount = 0;

        // For each number between 0 and 100
        for (int i = 0; i < 100; i++) {

            // Execute isPrime function and keep track of the amount of index points used 
            if (isPrime(i)) {
                omegaArray[indexCount] = i;

                // Increment the index count
                indexCount++;
            }
        }
        
        // Print the prime numbers between 0 and 100
        System.out.print("Prime numbers between zero and one hundered: ");

        // For loop to print all the values from changed indexes
        for (int i = 0; i < indexCount; i++) {
            System.out.print(omegaArray[i] + " ");
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {

        // Return false for 0 and 1
        if (num == 1 || num == 0)
            return false;
  
        // Check for divisibility by numbers up to the square root of the input number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            // Return false if the number is divisible by any number in the range
            if (num % i == 0)
                return false;
        }
  
        // Return true if the number is not divisible by any number in the range
        return true;
    }
}
