package com.deo.javalearning.inheritance;

public class ColoredBox extends Box {
    String color;

    public ColoredBox(int width, int length, String color) {
        super(width, length);
        this.color = color;
    }
    public void say() {
        System.out.println("ColoredBox");
    }
}
