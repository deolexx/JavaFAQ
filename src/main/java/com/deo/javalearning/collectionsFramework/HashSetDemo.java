package com.deo.javalearning.collectionsFramework;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Alpha");
        hashSet.add("Beta");
        hashSet.add("Gamma");
        hashSet.add("Delta");
        hashSet.add("Epsilon");

        System.out.println(hashSet);

    }
}
