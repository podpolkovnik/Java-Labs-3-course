package lab5;

public class Ellipse extends Circle {
    @Override 
    public void draw() {
        System.out.println("Эллипс: x = " + x +  ", y = " + y);
    }
}