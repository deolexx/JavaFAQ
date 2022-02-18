package com.deo.javalearning;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class PracticeTest {

    @ParameterizedTest
    @ValueSource(ints = {55})
    void twoIntsInArray(int sum) {
        int x = 0, y = 0;
        int[] ints = {2, 7, 1, 9, 4, 12, 3, 22, 6};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < ints.length - 1; i++) {
            if (map.get(sum - ints[i]) == null) {
                map.put(ints[i], i);
            } else {
                x = map.get(sum - ints[i]);
                y = i;
            }

        }
        System.out.println(x);
        System.out.println(y);
    }

    @Test
    void squareSorted() {
        int[] ints = {-5, -3, 0, 1, 2, 4};
        int[] ints1 = Arrays.stream(ints).map(x -> x * x).sorted().toArray();
        for (Integer i : ints1
        ) {
            System.out.println(i);
        }

    }

    @Test
    void reverse() {
        boolean equals = new StringBuffer("hello").reverse().toString().equals("olleh");
        assertTrue(equals);
    }

    @Test
    void anagram() {
        String a = Arrays.stream("hello".split("")).sorted().collect(Collectors.joining(""));
        String b = Arrays.stream("olleh".split("")).sorted().collect(Collectors.joining(""));
        assertTrue(a.equals(b));
    }

    @Test
    void fizzBuzz() {
        int n = 3;
        ArrayList<String> list = new ArrayList();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(i + "");
            }
        }
        assertEquals("1", list.get(0));
        assertEquals("2", list.get(1));
        assertEquals("Fizz", list.get(2));
    }

    @Test
    void fibonacci() {
        int fib = fib(4);
        assertEquals(3, fib);
    }

    int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

}


