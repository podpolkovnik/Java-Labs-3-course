package LabPackets.ru.novsu.povt.vpg.graphics;

public class Ellipse extends Circle {
    @Override public void draw() {
        System.out.println("Эллипс: x = " + x +  ", y = " + y);
    }
}