// A program that implements a bouncing ball in a 2D box from (-1, -1) to (1, 1)
// by using a Ball class for modeling the ball.
public class BouncingBallOO {
   public static void main(String[] args) {
      // set the size of the drawing canvas
      StdDraw.setCanvasSize(500, 500);

      // set the scale of the coordinate system
      StdDraw.setXscale(-1.0, 1.0);
      StdDraw.setYscale(-1.0, 1.0);

      // double buffering enables computer animations, creating an illusion of
      // motion by repeating four steps: clear, draw, show and pause
      StdDraw.enableDoubleBuffering();

      // a Ball object is created for modeling the bouncing ball
      Ball ball = new Ball(0.480, 0.860, 0.015, 0.017, 0.05);

      // the main animation loop
      while (true) {
         // bounce the ball off the walls based on the law of elastic collision
         // --------------------------------------------------------------------
         // if the ball hits the left/right wall
         if (Math.abs(ball.getX() + ball.getVx()) > 1.0 - ball.getR())
            // bounce the ball by reversing its speed in x-direction
            ball.setVx(-ball.getVx());

         // if the ball hits the top/bottom wall
         if (Math.abs(ball.getY() + ball.getVy()) > 1.0 - ball.getR())
            // bounce the ball by reversing its speed in y-direction
            ball.setVy(-ball.getVy());

         // move the ball by updating its position based on its speed
         // (using the move method of the Ball class)
         ball.move();

         // clear the offscreen canvas to color StdDraw.BOOK_LIGHT_BLUE
         StdDraw.clear(StdDraw.BOOK_LIGHT_BLUE);

         // draw the ball at its current position on the offscreen canvas as
         // a black filled circle
         StdDraw.setPenColor(StdDraw.BLACK);
         StdDraw.filledCircle(ball.getX(), ball.getY(), ball.getR());
         
         // show the drawing by copying the offscreen canvas to onscreen canvas
         StdDraw.show();
         StdDraw.pause(20); // and waiting for a short time (20 ms)
      }
   }
}