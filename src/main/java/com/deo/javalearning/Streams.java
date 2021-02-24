package com.deo.javalearning;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {


    public static String warnTheSheep(String[] array) {
        Collections.reverse(Arrays.asList(array));
        int pos = Arrays.asList(array).indexOf("wolf");

        return pos == 0 ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + pos + "! You are about to be eaten by a wolf!";
    }





    public static void main(String[] args) {

        System.out.println(warnTheSheep(new String[]{"sheep", "sheep", "wolf"}));




    }
}
