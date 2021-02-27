package com.deo.javalearning.lambdas;

import lombok.Data;

import java.time.LocalDate;
@Data
public class Person {

    public enum SEX {
        MALE, FEMALE
    }
    String name;
    LocalDate birthday;
    SEX gender;
    String emailAdress;


    public void printPerson() {

    }
}
