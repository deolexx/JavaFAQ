package com.deo.javalearning.core.exceptions;

public class ExceptionsDemo {

    public static  void divByZero() {
        int d = 0;
        int c = 5/d;
    }


    public static void main(String[] args) {
try {
    divByZero();
}catch (ArithmeticException e){e.printStackTrace();}
        System.out.println("After exception");


    }

}
