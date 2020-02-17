class Coords {
    public float getX() {
        return this.x;
    }
    public float getY() {
        return this.y;
    }

    private float x;
    private float y;
}

interface Graph {
    public void draw();
}

class Point implements Graph {
    public void moveTo(float x, float y) {

    }
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