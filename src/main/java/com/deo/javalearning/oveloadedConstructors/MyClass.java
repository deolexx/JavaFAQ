package com.deo.javalearning.oveloadedConstructors;

public class MyClass {
    int a;
    int b;

    MyClass(int i, int j){
        a = i;
        b = j;
    }
    MyClass(int i) {  //call first constructor
        this(i, i);
    }
    MyClass(){  //call second constructor
        this(0);
    }

}
