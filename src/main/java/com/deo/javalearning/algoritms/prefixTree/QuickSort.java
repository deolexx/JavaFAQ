package com.deo.javalearning.algoritms.prefixTree;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    public static int[] sort(int[] unsorted) {
        int pivot;
        if (unsorted.length < 2) {
            return unsorted;
        } else {
            pivot = unsorted[0];
            int[] less = Arrays.stream(unsorted).toArray();

            return null;
        }
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sort(new int[]{20})));
    }

}
