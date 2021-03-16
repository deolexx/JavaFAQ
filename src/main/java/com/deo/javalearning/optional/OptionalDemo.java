package com.deo.javalearning.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> noVal = Optional.empty();

        Optional<String> hasVal = Optional.of("Hello there");


        if (noVal.isPresent()) {
            System.out.println("No object to withdraw");
        }
        else System.out.println("Object noVal has no value");

        if (hasVal.isPresent()) {
            System.out.println("Object hasVal contains value: "+hasVal.get());
        }

        String defaultSt = noVal.orElse("some default string");
        System.out.println(defaultSt);

    }




}
