package com.deo.javalearning.core.interfaces;

public class TestClass implements B {
    @Override
    public void methWithoutBody() {
        System.out.println("Without body");
    }

    void testMeth() {
        System.out.println("TestMeth");
    }

}
