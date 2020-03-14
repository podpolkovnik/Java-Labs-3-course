package LabPackets.ru.novsu.povt.lea;

import LabPackets.ru.novsu.povt.lea.graphics.*;

public class Main {
    public static void main(String[] args) {
        Point circle = new Circle();
        circle.moveTo(120, 120);
        circle.draw();

        Background back = new Background();
        back.setColor("red");
        back.setTexture("steel");
        back.draw();
    }
}