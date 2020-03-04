package lab5;

public class MainWindow implements Movable {
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public void moveTo(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    private double x, y;
}