package com.deo.javalearning.lambdas;

import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;


public class Person {

    public enum SEX {
        MALE, FEMALE
    }
    String name;
    LocalDate birthday;
    SEX gender;
    String emailAdress;



    public void printPerson() {
        // ...
    }

    public static void printPersons(
            List<Person> roster, Predicate tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }

        }}
    public static void printPersonsWithPredicate(
            List<Person> roster, Predicate<Person> tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }



}



interface Predicate<T> {
    boolean test(T t);
}


