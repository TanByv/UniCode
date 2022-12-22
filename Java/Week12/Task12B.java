package Java.Week12;

public class Task12B {
    public static void main(String[] args) {
        // Create a 2D array with 3 rows and 4 columns
        int[][] array = new int[3][4];

        // Fill the array with random integer values between 0 and 1000
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                
                array[i][j] = (int)(Math.random() * 1001);
            }
        }

        // Print the array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }

        // Print the range, min, and max
        System.out.println("Range: " + findRange(array));
    }

    public static int findRange(int[][] array) {
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] < min) {
                    min = array[i][j];
                }

                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("\nMin: " + min);
        System.out.println("Max: " + max);

        return max - min;
    }
}