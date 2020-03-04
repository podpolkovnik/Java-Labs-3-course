package lab5;
import java.util.Vector;

public class Main {
    public static void swapXY(Movable object) {
        System.out.println("swap coordinates:\nx = " + object.getX() + ", y = " + object.getY());
        object.moveTo(object.getY(), object.getX());
    }
    public static void main(String[] args) {
        Vector<Movable> movableObjects = new Vector<Movable>();
        Movable circle = new Circle();
        Movable ellipse = new Ellipse();
        Movable rectangle = new Rectangle();
        Movable window = new MainWindow();

        movableObjects.add(circle);
        circle.moveTo(10, 20);
        movableObjects.add(ellipse);
        ellipse.moveTo(20, 40);
        movableObjects.add(rectangle);
        rectangle.moveTo(30, 60);
        movableObjects.add(window);
        window.moveTo(40, 80);

        for (Movable object : movableObjects) {
            try {
                swapXY(object);
            }
            catch (NullPointerException ex) {
                System.out.println ("Error while swapping coordinates.");
                ex.printStackTrace();        
            }
        }
    }
}