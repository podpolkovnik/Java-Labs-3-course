package LabPackets.ru.novsu.povt.vpg.graphics;

public class Rectangle extends Point {
    @Override public void draw() {
        System.out.println("Прямоугольник: x = " + x +  ", y = " + y);
    }
}