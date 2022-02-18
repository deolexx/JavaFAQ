package com.deo.javalearning.lombok;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@RequiredArgsConstructor
@Getter
@SuperBuilder
public class Child extends Parent{
    private String phone;
}
