package com.deo.javalearning.inheritance;

public class InheritanceTest {


    public static void main(String[] args) {
        Box box1 = new Box(2, 2);

        ColoredBox box2 = new ColoredBox(3, 4, "blue");

        Box box3 = new ColoredBox(5, 5, "grey");

      //  ColoredBox box4 = new Box(6,6);  Error
        box1.say();
        box2.say();
        box3.say();

        var o = new ColoredBox(4, 4, "blue");
        o.say();
    }
}
