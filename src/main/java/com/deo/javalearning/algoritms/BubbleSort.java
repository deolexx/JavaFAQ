package com.deo.javalearning.algoritms;

import java.util.ArrayList;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arr.add(new Random().nextInt(100));
        }
        System.out.print("Data array: ");

        for (Integer x : arr) {
            System.out.print(x + " ");
        }


        sortWithWhile(arr);
        sortWithDoubleFor(arr);
        printResult(arr);
    }

    private static void sortWithDoubleFor(ArrayList<Integer> arr) {
        for (int y = arr.size(); y > 0; y--) {
            for (int a = 1; a < arr.size(); a++) {
                if (arr.get(a) < arr.get(a - 1)) {
                    int tmp = arr.get(a);
                    arr.set(a, arr.get(a - 1));
                    arr.set(a - 1, tmp);
                }


            }
        }
    }

    private static void sortWithWhile(ArrayList<Integer> arr) {
        boolean isSorted=false;
        while (!isSorted) {
            isSorted=true;
            for (int a = 1; a < arr.size(); a++) {
                if (arr.get(a) < arr.get(a - 1)) {
                    int tmp = arr.get(a);
                    arr.set(a, arr.get(a - 1));
                    arr.set(a - 1, tmp);
                    isSorted = false;
                }
            }
        }
    }

    public static void printResult(ArrayList<Integer> arr) {
        System.out.print("\n Sorted: ");
        for (Integer x: arr) {
            System.out.print(x+" ");
        }
    }








}
