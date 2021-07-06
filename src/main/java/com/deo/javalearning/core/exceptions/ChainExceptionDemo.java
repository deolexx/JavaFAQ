package com.deo.javalearning.core.exceptions;

public class ChainExceptionDemo {
    static void demoproc() {
        //create exception
        NullPointerException e = new NullPointerException("upper level");
        //add exception cause
        e.initCause(new ArithmeticException(" cause"));

        throw e;
    }


    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            //print upper level exception
            System.out.println("exception catch:"+ e);

            //print exception which one cause this exception
            //for upper level exception
            System.out.println("Cause: "+e.getCause());
        }
    }
}
