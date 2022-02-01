package com.deo.javalearning.lambdaExpressions;
//Simple lambda expression demo

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Functional interface (Single Abstract Method)
@FunctionalInterface
        //marker annotation, not required

interface MyNumber {
    double getValue();
}

@FunctionalInterface
interface SingleNumber {
    double multiply(int x);
}

@FunctionalInterface
interface TwoNumbers {
    double add(int x, int y);
}

public class LambdaDemo {

    private static final Logger logger = LogManager.getLogger(LambdaDemo.class);

    public static void main(String[] args) {

        MyNumber myNum;
        SingleNumber single;
        TwoNumbers twoNumbers;

        myNum = () -> 123.45;
        logger.info(myNum.getValue());

        myNum = () -> Math.random() * 100;

        logger.info(myNum.getValue());

        myNum = () -> 10.0;

        logger.info(myNum.getValue());

        single = x -> x * x;
        logger.info(single.multiply(12));

        twoNumbers = (x, y) -> x + y;
        logger.info(twoNumbers.add(10, 20));

    }

}
