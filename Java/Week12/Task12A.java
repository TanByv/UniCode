package Java.Week12;

public class Task12A {
    public static void main(String[] args) {
        // Initialize a 2D array with size 10x10
        int[][] table = new int[10][10];

        // Populate the array with the multiplication table values
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        // Print the array to the console
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                // Print the value in the table with appropriate spacing
                System.out.printf("%4d", table[i][j]);
            }
            // Start a new line after printing each row
            System.out.println();
        }
    }
}
