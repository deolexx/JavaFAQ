package com.deo.javalearning.collectionsFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
public class LinkedHashSetDemo {
    public static void main(String[] args){
        HashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Alpha");
        linkedHashSet.add("Beta");
        linkedHashSet.add("Gamma");
        linkedHashSet.add("Delta");
        System.out.println(linkedHashSet);


    }


}
