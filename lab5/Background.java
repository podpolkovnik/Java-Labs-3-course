package lab3;

public class Background extends Graph {
    private String color = "none";
    private String texture = "none";
    @Override public void draw() {
        System.out.println("Цвет: " + color + ", текстура: " + texture);
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setTexture(String texture) {
        this.texture = texture;
    }
}