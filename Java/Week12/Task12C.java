package Java.Week12;

import java.util.Arrays;

public class Task12C {
    public static void main(String[] args) {

        double[] array = {1, 2, 3, 4, 10, 12};

        double mean = mean(array);
        double median = median(array);

        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
    }

    // Function to calculate the mean value of a given 1d array
    public static double mean(double[] array) {
        double sum = 0;

        for (double num : array) {
            sum += num;
        }

        return sum / array.length;
    }

    // Function to calculate the median value of a given 1d array
    public static double median(double[] array) {
        Arrays.sort(array);
        int length = array.length;

        if (length % 2 == 0) {
            return (array[length / 2] + array[length / 2 - 1]) / 2;
            
        } else {
            return array[length / 2];
        }
    }
}
