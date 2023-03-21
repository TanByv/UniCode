public class MyRectangle {
    private double x;
    private double y;
    private double w;
    private double h;

    public MyRectangle(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public void draw() {
        double halfW = w / 2;
        double halfH = h / 2;
        StdDraw.rectangle(x, y, halfW, halfH);
    }

    // Hardcoded since we're forced to use the NonoverlappingRectangles template
    public double distance(MyRectangle r) {
        double minDist = 0.003;
        double dx = Math.abs(this.x - r.x);
        double dy = Math.abs(this.y - r.y);
        double halfW = (this.w + r.w) / 2;
        double halfH = (this.h + r.h) / 2;
        if (dx < halfW + minDist && dy < halfH + minDist) {
            return 0;
        } else {
            return 1;
        }
    }
}
