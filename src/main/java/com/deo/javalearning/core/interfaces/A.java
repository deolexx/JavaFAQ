package com.deo.javalearning.core.interfaces;

public interface A {
    void methWithoutBody();

    default void methWithBody() {
        System.out.println("Default meth");
    }

}
