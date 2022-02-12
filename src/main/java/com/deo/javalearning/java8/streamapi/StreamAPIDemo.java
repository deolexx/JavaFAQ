package com.deo.javalearning.java8.streamapi;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamAPIDemo {

    static Logger logger = LogManager.getLogger(StreamAPIDemo.class);

    //watch tests

    public static void main(String[] args) {
        List<Book> books = List.of(new Book("War and Peace", "L.Tolstoy", 1000, 1880), new Book("Count Monte Cristo", "A. Duma", 800, 1850), new Book("Game of Thrones", "R. Martin", 1200, 1995));
        List<Book> collect = books.stream().peek(book -> book.setPrice(book.getPrice() / 10)).collect(Collectors.toList());
        logger.log(Level.WARN, collect);
        List<Book> collect1 = collect.stream().map(book -> {
            book.setName(book.getName().toLowerCase(Locale.ROOT));
            return book;
        }).collect(Collectors.toList());
        logger.log(Level.WARN, collect1);

    }
}
