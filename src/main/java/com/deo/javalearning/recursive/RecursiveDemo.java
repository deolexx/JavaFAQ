package com.deo.javalearning.recursive;

public class RecursiveDemo {

    public  static int factorial(int x) {
        if(x==1)return 1;
        int result = 0;

        return result=  factorial(x-1)*x;

    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

}
