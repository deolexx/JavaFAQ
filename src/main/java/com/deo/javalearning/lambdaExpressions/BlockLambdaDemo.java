package com.deo.javalearning.lambdaExpressions;

import java.util.stream.Stream;

interface StringFunc {
   String func(String n);
}

public class BlockLambdaDemo {
    public static void main(String[] args) {
        StringFunc reverse = (str) -> {
            return new StringBuilder(str).reverse().toString();
        };


        System.out.println(reverse.func("Hello"));

    }

}
