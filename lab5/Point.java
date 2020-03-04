package lab5;

public class Point implements Graph, Movable {
    protected double x, y;
    private String color = "none";
    @Override 
    public void draw() {
        System.out.println("Точка: x = " + x +  ", y = " + y);
    }
    @Override 
    public double getX() {
        return x;
    }
    @Override 
    public double getY() {
        return y;
    }
    @Override
    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
}