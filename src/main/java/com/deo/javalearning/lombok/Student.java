package com.deo.javalearning.lombok;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@RequiredArgsConstructor
@Getter
public class Student extends Child{
    private String school;
}
