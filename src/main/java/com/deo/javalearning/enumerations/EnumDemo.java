package com.deo.javalearning.enumerations;

public class EnumDemo {

    public static void main(String[] args) {
        Apple ap = Apple.Winesap;

        System.out.println(ap);

        System.out.println(Apple.Cortland==Apple.Jonathan);

        switch (ap) {
            case RedDel:  //Short name
                System.out.println("1");
            case Winesap:
                System.out.println("2");
        }

    }

}
