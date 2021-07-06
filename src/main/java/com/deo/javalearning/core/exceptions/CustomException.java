package com.deo.javalearning.core.exceptions;

public class CustomException extends Throwable{

    @Override
    public String toString() {
        return "Чтото непонятное случилось";
    }

    public static void main(String[] args) {

        try {
            throw new CustomException();
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

}
