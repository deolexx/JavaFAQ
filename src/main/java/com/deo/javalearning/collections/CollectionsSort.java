package com.deo.javalearning.collections;

import com.deo.javalearning.algoritms.BubbleSort;

import java.util.Arrays;
import java.util.Comparator;

public class CollectionsSort {
    public static void main(String[] args) {
        Integer [] array =new Integer[]{ 22, 34, 12, 46, 31, 58, 80, 92, 24, 4, 8, 16};
        Arrays.sort(array);
        Arrays.stream(array).forEach(integer -> System.out.print(integer+" "));
        Arrays.sort(array, Comparator.reverseOrder());
        System.out.println();
        Arrays.stream(array).forEach(integer -> System.out.print(integer+" "));


    }


 }
