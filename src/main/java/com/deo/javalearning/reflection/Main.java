package com.deo.javalearning.reflection;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        //Three different ways to get class for Car class
        //1.
        //In this one we have to surround it with try/catch because compiler know nothing
        //about our target class and its existence
        try {
            Class<?> carClass = Class.forName("com.deo.javalearning.reflection.Car");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //2.
        Car car = new Car();
        Class<? extends Car> aClass = car.getClass();
        //3.
        Class<Car> carClass = Car.class;

        try {
            Field horsepower = carClass.getDeclaredField("horsepower");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
