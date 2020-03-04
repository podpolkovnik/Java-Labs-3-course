package lab5;

public class Main {
    public static void main(String[] args) {
        Movable mainWindow = new MainWindow();
        mainWindow.moveTo(123, 123);
        System.out.println(mainWindow.getX());
        System.out.println(mainWindow.getY());

        Point point = new Point();
        point.moveTo(500, 500);
        point.draw();

        Background back = new Background();
        back.setColor("black");
        back.setTexture("stone");
        back.draw();
    }
}