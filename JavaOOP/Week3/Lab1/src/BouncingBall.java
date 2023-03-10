// A program that implements a bouncing ball in a 2D box from (-1, -1) to (1, 1).
public class BouncingBall {
   public static void main(String[] args) {
      // set the size of the drawing canvas
      StdDraw.setCanvasSize(500, 500);
      
      // set the scale of the coordinate system
      StdDraw.setXscale(-1.0, 1.0);
      StdDraw.setYscale(-1.0, 1.0);

      // double buffering enables computer animations, creating an illusion of
      // motion by repeating four steps: clear, draw, show and pause
      StdDraw.enableDoubleBuffering();

      // properties of the ball
      double x = 0.480, y = 0.860; // initial position (center coordinates)
      double vx = 0.015, vy = 0.017; // initial speed
      double radius = 0.05; // radius

      // the main animation loop
      while (true) {
         // bounce the ball off the walls based on the law of elastic collision
         if (Math.abs(x + vx) > 1.0 - radius) // if the ball hits the left/right wall
            vx = -vx; // bounce the ball by reversing its speed in x-direction

         if (Math.abs(y + vy) > 1.0 - radius) // if the ball hits the top/bottom wall
            vy = -vy; // bounce the ball by reversing its speed in y-direction

         // move the ball by updating its position based on its speed
         x = x + vx;
         y = y + vy;

         // clear the offscreen canvas to color StdDraw.BOOK_LIGHT_BLUE
         StdDraw.clear(StdDraw.BOOK_LIGHT_BLUE);

         // draw the ball at its current position on the offscreen canvas
         StdDraw.setPenColor(StdDraw.BLACK); // set the color for drawing the ball
         StdDraw.filledCircle(x, y, radius); // draw the ball as a filled circle
         
         // show the drawing by copying the offscreen canvas to onscreen canvas
         StdDraw.show();
         StdDraw.pause(20); // and waiting for a short time (20 ms)
      }
   }
}