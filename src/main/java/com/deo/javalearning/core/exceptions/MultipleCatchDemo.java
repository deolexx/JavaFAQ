package com.deo.javalearning.core.exceptions;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int vals[] = {1, 2, 3};
        try {
            int result = a / b; //generate ArithmeticException
            vals[10] = 19; //generate ArrayIndexOutOfBondsException
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catched "+ e);
        }

    }
}
