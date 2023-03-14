public class Test {
    public static void main(String[] args) {
        // Create two balls
        Ball ball1 = new Ball(0.2, 0.3, 0.007, 0.005, 0.05);
        Ball ball2 = new Ball(0.6, 0.7, 0.003, 0.009, 0.05);

        // Set up an animation loop
        StdDraw.enableDoubleBuffering();
        while (true) {
            // Move the balls
            ball1.move();
            ball2.move();

            // Check for collisions
            double dist = Math.sqrt(Math.pow(ball1.getX() - ball2.getX(), 2) + Math.pow(ball1.getY() - ball2.getY(), 2));
            if (dist < ball1.getR() + ball2.getR()) {
                ball1.setVx(ball1.getVx() * -1);
                ball2.setVx(ball2.getVx() * -1);
                ball1.setVy(ball1.getVy() * -1);
                ball2.setVy(ball2.getVy() * -1);
            }

            // Check for collisions with the wall
            if (ball1.getX() + ball1.getR() >= 1.0) {
                ball1.setVx(ball1.getVx() * -1);
            }
            if (ball2.getX() + ball2.getR() >= 1.0) {
                ball2.setVx(ball2.getVx() * -1);
            }
            if (ball1.getX() - ball1.getR() <= 0.0) {
                ball1.setVx(ball1.getVx() * -1);
            }
            if (ball2.getX() - ball2.getR() <= 0.0) {
                ball2.setVx(ball2.getVx() * -1);
            }
            if (ball1.getY() + ball1.getR() >= 1.0) {
                ball1.setVy(ball1.getVy() * -1);
            }
            if (ball2.getY() + ball2.getR() >= 1.0) {
                ball2.setVy(ball2.getVy() * -1);
            }
            if (ball1.getY() - ball1.getR() <= 0.0) {
                ball1.setVy(ball1.getVy() * -1);
            }
            if (ball2.getY() - ball2.getR() <= 0.0) {
                ball2.setVy(ball2.getVy() * -1);
            }

            // Clear the background
            StdDraw.clear();

            // Draw the balls
            StdDraw.filledCircle(ball1.getX(), ball1.getY(), ball1.getR());
            StdDraw.filledCircle(ball2.getX(), ball2.getY(), ball2.getR());

            // Show the drawing
            StdDraw.show();

            // Pause for 10 milliseconds
            StdDraw.pause(10);
        }
    }
}