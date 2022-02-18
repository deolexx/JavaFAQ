package com.deo.javalearning.lombok;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LombokDemo {

    public static void main(String[] args) {
    Student student = Student.builder().school("123").name("").build();
        log.info(String.valueOf(student));

    }

}

