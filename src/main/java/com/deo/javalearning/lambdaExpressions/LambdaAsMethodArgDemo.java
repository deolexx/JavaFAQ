package com.deo.javalearning.lambdaExpressions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;

@FunctionalInterface
interface FuncInt {
    String func(String n);
}

public class LambdaAsMethodArgDemo {
    static Logger logger = LogManager.getLogger(LambdaAsMethodArgDemo.class);

    //method with a functional interface as first parameter type
    static String sFunc(FuncInt n, String s) {
        return n.func(s);
    }

    public static void main(String[] args) {

        String example = "Hello Stranger";

        //transfer lambda as parameter
        String result = sFunc(tmp -> tmp.toUpperCase(Locale.ROOT), example);

        logger.info(result);

    }

}
