// A class for modeling a bouncing ball as a Ball object
public class Ball {
	// private data fields (instance variables) that cannot be directly
	// accessed or modified outside the Ball class
	private double x, y; // x and y coordinates of the ball's center
	private double vx, vy; // x and y components of the ball's speed
	private double r; // radius of the ball

	// constructor for creating a Ball object based on the input arguments
	public Ball(double x, double y, double vx, double vy, double r) {
		// this keyword is used to distinguish the data fields from the input
		// arguments both of which having the same names
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
		this.r = r;
	}

	// getter/accessor method for the x coordinate of the ball's center
	public double getX() {
		return x;
	}

	// getter/accessor method for the y coordinate of the ball's center
	public double getY() {
		return y;
	}

	// getter/accessor method for the x component of the ball's speed
	public double getVx() {
		return vx;
	}

	// getter/accessor method for the y component of the ball's speed
	public double getVy() {
		return vy;
	}

	// getter/accessor method for the radius of the ball
	public double getR() {
		return r;
	}

	// setter/update/mutator method for the x component of the ball's speed
	public void setVx(double vx) {
		this.vx = vx;
	}

	// setter/update/mutator method for the y component of the ball's speed
	public void setVy(double vy) {
		this.vy = vy;
	}

	// utility method for moving the ball based on its speed
	public void move() {
		// update the position of the ball based on its speed
		x = x + vx;
		y = y + vy;
	}
}