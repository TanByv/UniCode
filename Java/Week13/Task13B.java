package Java.Week13;

import java.util.Arrays;

public class Task13B {
    public static void main(String[] args) {
        // Generate an array of 10 random integers between 0 and 100
        int[] RandomArray = new int[10];
        for (int i = 0; i < RandomArray.length; i++) {
            RandomArray[i] = (int)(Math.random() * 101);
        }

        // Print the unsorted array
        System.out.println("Random array: " + Arrays.toString(RandomArray));

        // Sort the array using bubble sort
        int[] SortedArray = bubbleSort(RandomArray);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(SortedArray));
    }

    public static int[] bubbleSort(int[] array) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }
}