package Java.Week13;

import java.util.Arrays;

public class Task13A {
    public static void main(String[] args) {
        // Generate an array of 10 random integers between 0 and 100
        int[] RandomArray = new int[10];
        for (int i = 0; i < RandomArray.length; i++) {
            RandomArray[i] = (int)(Math.random() * 101);
        }

        // Print the unsorted array
        System.out.println("Random array: " + Arrays.toString(RandomArray));

        // Sort the array using insertion sort
        int[] sortedArray = insertionSort(RandomArray);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        return array;
    }
}