package com.deo.javalearning.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS) //controls how long the annotation MyAnno will hold in system
@interface MyAnno {    // use @ symbol instead of access modifier to create an annotation
    String str();  //annotation methods cannot have a body
    int val();
}
