package com.deo.javalearning.java8.streamapi;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {
    private String name;
    private String author;
    private int price;
    private int year;
}
