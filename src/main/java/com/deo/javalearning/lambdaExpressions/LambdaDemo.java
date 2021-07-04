package com.deo.javalearning.lambdaExpressions;
//Simple lambda expression demo

//Functional interface (Single Abstract Method)
@FunctionalInterface
        //marker annotation, not required


interface MyNumber {
    double getValue();
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum; //create reference to the interface

       myNum = () -> 123.45;

        System.out.println(myNum.getValue());


       myNum = () -> Math.random() * 100;

        System.out.println(myNum.getValue());
    }


}
