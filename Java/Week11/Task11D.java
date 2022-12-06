package Java.Week11;

public class Task11D {
    public static void main(String[] args) {

        // Define the coordinates of the points as an array
        double[][] coordinates = { {5.0, 10.0}, {15.0, 20.0}, {25.0, 30.0}, {35.0, 40.0}, {20.0, 15.0} };

        // Create an array to store the distances between the points
        double[] distances = new double[coordinates.length * (coordinates.length - 1) / 2];

        // Nested for loop to calculate the distances between all pairs of coordinates
        int index = 0;
        for (int i = 0; i < coordinates.length - 1; i++) {
            for (int j = i + 1; j < coordinates.length; j++) {
                double x1 = coordinates[i][0];
                double y1 = coordinates[i][1];
                double x2 = coordinates[j][0];
                double y2 = coordinates[j][1];
                distances[index] = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
                index++;
            }
        }

        // Print the distances
        for (int i = 0; i < distances.length; i++) {
            System.out.println("Distance " + (i + 1) + ": " + distances[i]);
        }
    }
}
