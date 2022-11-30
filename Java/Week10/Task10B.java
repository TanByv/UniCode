package Java.Week10;

public class Task10B {

    public static void main(String[] args) {
        
        int[] epicArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};  // Set the array
        int primeAmount = 0;    // Counter

        for (int i = 0; i < epicArray.length; i++) {    // For every index in epicArray, run isPrime and count the amount of true results

            if (isPrime(epicArray[i]) == true) {
                primeAmount++;
            }
        }

        System.out.println("There are " + primeAmount + " prime numbers inside the given array.");  // Print the result
    }

    public static boolean isPrime(int num) {

        if (num < 2)
            return false;
  
        for (int i = 2; i < num; i++) // Set i as 2 and if increment 1 until it's equal or bigger than the input
            if (num % i == 0)
                return false;
  
        return true;
    }
}
