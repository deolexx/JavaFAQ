package com.deo.javalearning.instanceOf;



class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}


public class InstanceOfDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A) {
            System.out.println("a is an instance of A");
        }
        if (b instanceof B) {
            System.out.println("b is an instance of B");
        }
        if (c instanceof C) {
            System.out.println("c is an instance of C");
        }
        if (d instanceof D) {
            System.out.println("d is an instance of D");
        }

        System.out.println();

        //compare with generated types
        A ob;
        ob = d; //link to B class objectw
        System.out.println("ob now refers to d");
        if (ob instanceof D)
            System.out.println("ob can be casted to D");
        System.out.println();

        ob = c;
        System.out.println("ob now refers to c");
        if (ob instanceof D) {
            System.out.println("ob can be casted to D");
        } else System.out.println("ob cant be casted to D");
        if (ob instanceof A)
            System.out.println("ob can be casted to A");


        System.out.println();


    }
}


