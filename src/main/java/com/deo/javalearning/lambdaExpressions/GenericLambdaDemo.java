package com.deo.javalearning.lambdaExpressions;

import java.util.Locale;

@FunctionalInterface
interface GenFunc<T>{
    T func(T t);
}

public class GenericLambdaDemo {
    public static void main(String[] args) {
        GenFunc<String> toLowCase = (str)->{
            return str.toLowerCase(Locale.ROOT);
        };

        GenFunc<Integer> doubleNumbers = (n) -> {
          return n*n;
        };


        System.out.println(toLowCase.func("RAVE!!!!!!"));
        System.out.println(doubleNumbers.func(5));


    }
}
