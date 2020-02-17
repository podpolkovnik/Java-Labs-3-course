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