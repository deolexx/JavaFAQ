package com.deo.javalearning.collections;

import java.util.*;

public class HashMapDemo {





    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");
        map.put(5,"Five");





        map.forEach((k,v)-> System.out.println("key: "+k+" value: "+v));
        System.out.println(map.merge(6, "Star",String::concat));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());



    }


}
