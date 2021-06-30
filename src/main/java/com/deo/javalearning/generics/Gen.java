package com.deo.javalearning.generics;
/*Simple generic class where T marks parameter type which will be replaced with real type*/
public class Gen<T> {
    T ob; //declares T type object

    //send to the constructor link to the type T object
    Gen(T o) {
        ob = o;
    }

    //return ob object

    T getOb() {
        return ob;
    }

    //shows T type

    void showType() {
        System.out.println("T ctype is an "+ob.getClass().getName());
    }
}
