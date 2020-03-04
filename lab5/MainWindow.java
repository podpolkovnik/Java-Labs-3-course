package lab5;

public class MainWindow implements Movable {
    public MainWindow() {
        this.x = 0;
        this.y = 0;
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println("coordinates changed:\nx = " + this.x + ", y = " + this.y + "\n");
    }

    private double x, y;
}