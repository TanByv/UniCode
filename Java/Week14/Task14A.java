package Java.Week14;

import java.util.Arrays;

public class Task14A {
    public static void main(String[] args) {
        // Generate a random 1D array of size 5, filled with random integers between 0 and 10
        int[] randomArray = new int[5];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int)(Math.random() * 11); // Generate a random integer between 0 and 10
        }

        // Print the randomly generated array
        System.out.println("Random array: " + Arrays.toString(randomArray));

        // Sort the array using the selection sort algorithm
        int[] sortedArray = randomArray;
        for (int i = 0; i < sortedArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[j] < sortedArray[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[minIndex];
            sortedArray[minIndex] = temp;
        }

        // Print the the sorted version of the array
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
    }
}