package Java.Week13;

import java.util.Arrays;
import java.util.Random;

public class Labworks10 {
    public static void main(String[] args) {
        // Create an array of 15 randomly generated integers in the range [0, 9]
        int[] array = new int[15];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        // Print the original array using the Arrays.toString() method
        System.out.println("Random array: " + Arrays.toString(array));

        // Count the occurrences of each possible value (the range [0, 9]) in the array
        int[] count = new int[10];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }

        // Print the count for each value
        System.out.println();
        for (int i = 0; i < count.length; i++) {
            System.out.println("Amount of " + i + "s: " + count[i]);
        }

        // Create another array for storing the sorted elements in the array
        int[] sortedArray = new int[array.length];

        // Perform sorting (in increasing order) based on the count of each value
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                sortedArray[index] = i;
                index++;
            }
        }

        // Print the sorted array using the Arrays.toString() method
        System.out.println("\nSorted array: " + Arrays.toString(sortedArray));
    }
}