package com.deo.javalearning;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {


    public static String fakeBin(String numberString) {
     return numberString.replaceAll("[0-4]","0").replaceAll("[5-9]","1");
    }

    public static void main(String[] args) {
        System.out.println(fakeBin("12622388"));
    }

}
