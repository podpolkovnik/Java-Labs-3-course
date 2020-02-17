class Coords {
    public Coords(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float x;
    public float y;
}

abstract class Graph {
    public abstract void draw();
}

class Point extends Graph {
    public Point() {
        this.coords = new Coords(0, 0);
        this.color = "white";
    }
    public void moveTo(float x, float y) {
        this.coords.x = x;
        this.coords.y = y;
    }
    public void move(float dx, float dy) {
        this.coords.x += dx;
        this.coords.y += dy;
    }
    public void draw() {
        System.out.println("Точка: x = " + this.coords.x + ", y = " + this.coords.y);
    }
    public String getColor() {
        return this.color;
    }
    public Coords getCoords() {
        return coords;
    }
    public void setColor(String color) {
        this.color = color;
    }

    private String color;
    private Coords coords;
 }

class Background extends Graph {
    public Background() {
        this.color = "white";
        this.texture = "none";
    }
    public void draw() {
        System.out.println("Цвет: " + this.color + ", текстура: " + this.texture);
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getTexture() {
        return texture;
    }
    public void setTexture(String texture) {
        this.texture = texture;
    }

    private String color;
    private String texture;
}

class Circle extends Point {
    public void draw() {
        System.out.println("Круг: x = " + this.getCoords().x + ", y = " + this.getCoords().y);
    }
}

class Rectangle extends Point {
    public void draw() {
        System.out.println("Прямоугольник: x = " + this.getCoords().x + ", y = " + this.getCoords().y);
    }
}

class Ellipse extends Circle {
    public void draw() {
        System.out.println("Эллипс: x = " + this.getCoords().x + ", y = " + this.getCoords().y);
    }
}

class Main {
    public static void main(String[] args) {
        Background back = new Background();
        back.setColor("red");
        back.setTexture("steel");
        back.draw();

        Point rectangle = new Rectangle();
        rectangle.moveTo(500, 123);
        rectangle.draw();
    }
}