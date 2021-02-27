package com.deo.javalearning;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Codewars {
    public static void main(String[] args) {

        var list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        var iter = list.iterator();

        while (iter.hasNext()) {

            System.out.println((iter.next()));
        }


        list.forEach((o) -> {
            System.out.println(o);
        });


        Consumer<Integer> method = (n) -> { System.out.println(n); };

    }











}
