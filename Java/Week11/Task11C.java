package Java.Week11;

public class Task11C {
    public static void main(String[] args) {

        // The distances array contains the distances to the objects
        double[][] distances = {{0, 455, 480, 694}, {455, 0, 587, 475}, {480, 587, 0, 457}, {694, 475, 457, 0}};

        // Initialize the shortest and highest values to the first non-zero element
        double shortest = Double.MAX_VALUE;
        double highest = Double.MIN_VALUE;
        int min_i=0, min_j=0, max_i=0, max_j=0;
        
        // Loop through the distances array and update the shortest and highest values
        for (int i = 0; i < distances.length; i++) {
            for (int j = 0; j < distances[i].length; j++) {

                if (distances[i][j] != 0) { // Make sure the distance is longer than 0
                    if (distances[i][j] < shortest) {
                        shortest = distances[i][j];
                        min_i=i;
                        min_j=j;
                    }

                    if (distances[i][j] > highest) {
                        highest = distances[i][j];
                        max_i=i;
                        max_j=j;
                    }
                }
            }
        }

        // Print the shortest and highest values and the names associated with them
        System.out.println("Shortest distance: " + shortest + " (" + cities(min_i) + ", " + cities(min_j) + ")");
        System.out.println("Longest distance: " + highest + " (" + cities(max_i) + ", " + cities(max_j) + ")");

    }

    public static String cities(int x) {
        String[] names = {"Istanbul", "Ankara", "İzmir", "Antalya"};
        return names[x];
    }
}
