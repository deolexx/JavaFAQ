package com.deo.javalearning.generics;

public class GenConstructors {

    private double val;
    //you can use generics constructors even if the class isn`t generic
    <T extends Number> GenConstructors(T arg) {
        val = arg.doubleValue();
    }

    void showVal(){
        System.out.println(val);
    }

}
class GenConstructorsDemo{
    public static void main(String[] args) {
        //you can use any notNull number argument
       GenConstructors test1 =  new GenConstructors(1);
       GenConstructors test2 =  new GenConstructors(12.2F);


       test1.showVal();
       test2.showVal();


    }
}