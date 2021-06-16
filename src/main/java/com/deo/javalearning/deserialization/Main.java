package com.deo.javalearning.deserialization;

import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main {

@SneakyThrows
    public static void main(String[] args) {

        User user = null;

        FileInputStream fileInputStream = new FileInputStream("C:\\Programming\\javalearning\\UsrInfo.ser");

    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);


    user = (User) objectInputStream.readObject();

    objectInputStream.close();
    fileInputStream.close();

    System.out.println(user.name);
    System.out.println(user.password);
    user.sayHello();
    }
}
