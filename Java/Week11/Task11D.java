package Java.Week11;

public class Task11D {
    public static void main(String[] args) {

        // Define a matrix of points and an array of labels
        double[][] pointMatrix = {{0, 5}, {6, 5}, {4, 4}, {2, 1}, {6, 0}};
        String[] pointArray = {"A", "B", "C", "D", "E"};

        // Print the coordinates and labels
        System.out.print("Coordinates and letters associated with them: ");
        for (int i = 0; i < pointArray.length; i++) {
            System.out.print(pointArray[i] + " = (" + pointMatrix[i][0] + ", " + pointMatrix[i][1]+ ") ");
        }

        // Initialize variables for computing the minimum distance
        double x1, x2, y1, y2, calcDist;
        int min_i = 0, min_j = 0;
        double minValue = Double.MAX_VALUE;

        // Loop through all pairs of points and compute the minimum distance
        for (int i = 0; i < pointMatrix.length-1; i++) {
            for (int j = i+1; j < pointMatrix.length; j++) {
                
                // Extract the coordinates of the two points
                x1 = pointMatrix[ i ][0];
                y1 = pointMatrix[ i ][1];
                x2 = pointMatrix[ j ][0];
                y2 = pointMatrix[ j ][1];

                // Compute the distance between the two points
                calcDist = distanceFunc(x1, y1, x2, y2);

                // Update the minimum distance if necessary
                if (calcDist < minValue) {
                    minValue = calcDist;
                    min_i = i;
                    min_j = j;
                }
            }
        }

        // Print the closest two points and their labels
        System.out.println("\nClosest two points to eachother are: " + pointArray[min_i] + " and " + pointArray[min_j]);
    }

    // Compute the distance between two points (x1, y1) and (x2, y2)
    public static double distanceFunc (double x1, double y1, double x2, double y2) {

        return Math.sqrt((x1-x2) * (x1-x2) + (y1-y2) * (y1-y2)); 
    }
}
