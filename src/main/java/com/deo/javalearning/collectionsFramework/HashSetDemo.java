package com.deo.javalearning.collectionsFramework;

import java.util.HashSet;
import java.util.Set;

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
