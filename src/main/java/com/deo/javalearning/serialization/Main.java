package com.deo.javalearning.serialization;

import lombok.SneakyThrows;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
       User user = new User();

        user.name = "Bro";
        user.password = "1234";


        FileOutputStream fileOutputStream = new FileOutputStream("UsrInfo.ser");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);


        objectOutputStream.writeObject(user);

        objectOutputStream.close();
        fileOutputStream.close();

        System.out.println("object info saved");
    }


}
