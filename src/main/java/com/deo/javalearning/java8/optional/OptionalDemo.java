package com.deo.javalearning.java8.optional;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> noVal = Optional.empty();

        Optional<String> hasVal = Optional.of("Hello there");


        if (noVal.isPresent()) {
            System.out.println("No object to withdraw");
        }
        else

        if (hasVal.isPresent()) {

        }

        String defaultSt = noVal.orElse("some default string");
        System.out.println(defaultSt);


        Integer x = null;

        Optional.ofNullable(x).ifPresent(integer -> System.out.println(integer));

        OptionalInt.of(x).ifPresent(integer -> System.out.println(integer));

    }








}
