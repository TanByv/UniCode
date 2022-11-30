package Java.Week10;

public class Task10C {

    public static void main(String[] args) {
        
        int[] crazyArray = {101, 13, 45, 99, 78, 65, 76};   // Define an example array

        System.out.println(biggestArrayElement(crazyArray) + " is the biggest number in the given array."); // Call and print the function using the example array as input

    }

    public static int biggestArrayElement(int Array[]) {

        int currentMax = 0;

        for (int i = 0; i < Array.length; i++) {    // For each index in the array, compare them and find the biggest one.
            
            if (Array[i] > currentMax) {
                
                currentMax = Array[i];
            }
        }

        return currentMax;
    }
}