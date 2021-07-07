package com.deo.javalearning.algoritms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arr.add(new Random().nextInt(100));
        }
System.out.print("Data array: ");
        for (Integer x : arr) {
            System.out.print(x + " ");
        }


        insertionSort(arr);
        BubbleSort.printResult(arr);
    }


    public static void insertionSort(ArrayList<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
        int current = arr.get(i);
        int j = i;
            while (j > 0 && arr.get(j - 1) > current) {
                arr.set(j,arr.get(j-1));
                j--;
            }
            arr.set(j,current);

        }
    }

}
