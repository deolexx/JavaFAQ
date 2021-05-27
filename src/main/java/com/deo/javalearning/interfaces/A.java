package com.deo.javalearning.interfaces;

public interface A {
    void methWithoutBody();

    default void methWithBody() {
        System.out.println("Default meth");
    }

}
