package Java.Week11;

public class Task11A {
    public static void main(String[] args) {
        int[][] arrayName = new int[7][8]; // Create a 7 by 8 array of type int

        // Fill the array with random numbers between 15 and 77
        for (int i = 0; i < arrayName.length; i++) {
            for (int j = 0; j < arrayName[i].length; j++) {
                
                arrayName[i][j] = (int)(Math.random() * 63) + 15;
            }
        }

        // Print the array to the console
        for (int i = 0; i < arrayName.length; i++) {
            for (int j = 0; j < arrayName[i].length; j++) {

                System.out.print(arrayName[i][j] + " ");
            }

            System.out.println(); // Print a newline after each row
        }
    }
}
