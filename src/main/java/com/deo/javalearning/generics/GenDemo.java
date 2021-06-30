package com.deo.javalearning.generics;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        Gen<Double> dOb;
        Gen<String> sOb;

        iOb = new Gen<>(88);
        dOb = new Gen<>(2.2);
        sOb = new Gen<>("Hello");

        iOb.showType();
        System.out.println(iOb.getOb());
        dOb.showType();
        sOb.showType();
        System.out.println(sOb.getOb());

    }
}
