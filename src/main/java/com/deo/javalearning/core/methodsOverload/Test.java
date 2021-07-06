package com.deo.javalearning.core.methodsOverload;

public class Test {



     static void birdwalk (Birds b){
        b.walk();
    }


    public static void main(String[] args) {
        Birds bird =  new Birds();
        Eagle eagle = new Eagle();
       birdwalk(bird);
       birdwalk(eagle);
    }
}
