package Java.Week11;

public class Labworks8 {
    public static void main(String[] args) {
        // Create an array of size 10
        int[] numbers = new int[10];

        // Fill the array with random numbers between 0 and 100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100);
        }

        // Print the array
        System.out.print("Random array: [");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);

            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Sort the array using insertion sort
        for (int i = 1; i < numbers.length; i++) {
            int current = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > current) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            numbers[j + 1] = current;
        }

        // Print the sorted array
        System.out.print("Sorted array: [");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);

            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
