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

    boolean overlapping(MyRectangle r) {
        double minDist = 0.003;
        double dx = Math.abs(this.x - r.x);
        double dy = Math.abs(this.y - r.y);
        double halfW = (this.w + r.w) / 2;
        double halfH = (this.h + r.h) / 2;
        return dx < halfW + minDist && dy < halfH + minDist;
    }

    public double distance(MyRectangle r) {
        double halfW1 = w / 2;
        double halfH1 = h / 2;
        double centerX1 = x + halfW1;
        double centerY1 = y + halfH1;
    
        double halfW2 = r.w / 2;
        double halfH2 = r.h / 2;
        double centerX2 = r.x + halfW2;
        double centerY2 = r.y + halfH2;
    
        double dx = Math.abs(centerX1 - centerX2);
        double dy = Math.abs(centerY1 - centerY2);
    
        double halfW = halfW1 + halfW2;
        double halfH = halfH1 + halfH2;
    
        if (dx < halfW && dy < halfH) {
            return 0; // rectangles overlap
        } else {
            double horizontalDist = Math.max(dx - halfW, 0);
            double verticalDist = Math.max(dy - halfH, 0);
            return horizontalDist + verticalDist;
        }
    }
    
}
