class Coords {
    public float x;
    public float y;
}

interface Graph {
    public void draw();
}

class Point implements Graph {
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

    private Coords coords;
 }

class Background implements Graph {

}

class Circle extends Point {

}

class Rectangle extends Point {

}

class Ellipse extends Circle {

}

class Main {
    public static void main(String[] args) {
        
    }
}