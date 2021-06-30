package com.deo.javalearning.staticImport;

import static java.lang.Math.pow;
public class StaticImportDemo
{
    public static void main(String[] args) {
        System.out.println(pow(2,2));  //with static import
        System.out.println(Math.pow(2,2));  //without static import
    }


}
