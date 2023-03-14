public class BouncingBalls {
    public static void main(String[] args) {
        StdDraw.enableDoubleBuffering();

        // Set canvas size and scale
        StdDraw.setCanvasSize(800, 800);
        StdDraw.setXscale(-1, 1);
        StdDraw.setYscale(-1, 1);

        // Create an array of 100 Ball objects
        Ball[] balls = new Ball[100];
        for (int i = 0; i < balls.length; i++) {
            double x = Math.random() * 1.8 - 0.9; // random x between -0.9 and 0.9
            double y = Math.random() * 1.8 - 0.9; // random y between -0.9 and 0.9
            double vx = Math.random() * 0.04 - 0.02; // random vx between -0.02 and 0.02
            double vy = Math.random() * 0.04 - 0.02; // random vy between -0.02 and 0.02
            double r = Math.random() * 0.08 + 0.02; // random radius between 0.02 and 0.1
            balls[i] = new Ball(x, y, vx, vy, r);
        }

        // Animation loop
        while (true) {
            // Clear canvas
            StdDraw.clear();

            // Draw and move each ball
            for (int i = 0; i < balls.length; i++) {
                balls[i].move();
                // Reverse direction and change color if ball hits wall
                if (Math.abs(balls[i].getX()) + balls[i].getR() >= 1) {
                    balls[i].setVx(-balls[i].getVx());
                }
                if (Math.abs(balls[i].getY()) + balls[i].getR() >= 1) {
                    balls[i].setVy(-balls[i].getVy());
                }
                balls[i].draw();
            }

            // Render frame every 20 milliseconds
            StdDraw.show();
            StdDraw.pause(20);
        }
    }
}