package com.deo.javalearning.lambdaExpressions;


import java.util.Locale;
@FunctionalInterface
interface FuncInt{
    String func(String n);
}

public class LambdaAsMethodArgDemo {
    //method with a functional interface as first parameter type
    static String sFunc(FuncInt n, String s) {
        return n.func(s);
    }

    public static void main(String[] args) {

        String example = "Hello Stranger";

        //transfer lambda as parameter
        String result = sFunc((tmp)->tmp.toUpperCase(Locale.ROOT),example);

        System.out.println(result);


    }


}
