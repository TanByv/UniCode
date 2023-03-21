import java.util.Random;

public class NonoverlappingRectangles {
    public static void main(String[] args) {
        int canvasWidth = 500, canvasHeight = 500;
        StdDraw.setCanvasSize(canvasWidth, canvasHeight);
        StdDraw.setScale(0, 1);
        int N = 250;
        MyRectangle[] rectangles = new MyRectangle[N];
        Random randomGenerator = new Random();
        double rMin = 0.02, rMax = 0.2;
        int rectangleCount = 0;

        while (rectangleCount < N) {
            double w = rMin + (rMax - rMin) * randomGenerator.nextDouble();
            double h = rMin + (rMax - rMin) * randomGenerator.nextDouble();
            double minDist = 0.003, halfWidth = w / 2, halfHeight = h / 2;
            double minX = minDist + halfWidth, maxX = 1 - minX;
            double x = minX + (maxX - minX) * randomGenerator.nextDouble();
            double minY = minDist + halfHeight, maxY = 1 - minY;
            double y = minY + (maxY - minY) * randomGenerator.nextDouble();
            MyRectangle newRectangle = new MyRectangle(x, y, w, h);
            if (overlapping(newRectangle, rectangles)) {
                continue;
            }
            rectangles[rectangleCount++] = newRectangle;
            System.out.println("Rectangle count: " + rectangleCount);
            newRectangle.draw();
        }
        System.out.println("\nProgram finished.");
    }

    public static boolean overlapping(MyRectangle r, MyRectangle[] rArray) {
        for (MyRectangle rect : rArray) {
            if (rect == null) {
                break;
            }
            if (r.overlapping(rect)) {
                return true;
            }
        }
        return false;
    }
}
