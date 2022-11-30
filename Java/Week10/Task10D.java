package Java.Week10;

public class Task10D {
    public static void main(String[] args) {

        int[] omegaArray = new int[100];    // Create a new 100 length array
        int indexCount = 0;

        for (int i = 0; i <= 100; i++) {    // For each number between 0 and 100
            
            if (isPrime(i) == true) {   // Execute isPrime function and keep track of the amount of index points used 
                
                omegaArray[indexCount] = i;

                indexCount++;
            }
        }
        
        System.out.print("Prime numbers between zero and one hundered: ");

        for (int i = 0; i < indexCount; i++) {   // For loop to print all the values from changed indexes

            System.out.print(omegaArray[i] + " ");
        }

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
