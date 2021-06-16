package com.deo.javalearning.deserialization;

import java.io.Serializable;

public class User implements Serializable {

    public String name;
    public String password;


    public void sayHello() {
        System.out.println("Hello "+name);
    }

}
