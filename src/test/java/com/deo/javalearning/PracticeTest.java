package com.deo.javalearning;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

    @org.junit.jupiter.api.Test
    void squareSorted() {
        int[] ints = {-5, -3, 0, 1, 2, 4};
        int[] ints1 = Arrays.stream(ints).map(x -> x * x).sorted().toArray();
        for (Integer i : ints1
        ) {
            System.out.println(i);
        }

    }

    @org.junit.jupiter.api.Test
    void reverse() {
        boolean equals = new StringBuffer("hello").reverse().toString().equals("olleh");
        assertTrue(equals);
    }

    @org.junit.jupiter.api.Test
    void anagram() {
        String a = Arrays.stream("hello".split("")).sorted().collect(Collectors.joining(""));
        String b = Arrays.stream("olleh".split("")).sorted().collect(Collectors.joining(""));
        assertEquals(a, b);
    }

    @org.junit.jupiter.api.Test
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

    @org.junit.jupiter.api.Test
    void fibonacci() {
        int fib = fib(4);
        assertEquals(3, fib);
    }

    private int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    @ParameterizedTest
    @ValueSource(strings = {"({})"})
    void validParentheses(String input) {

        boolean result = true;
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c) {
                result = false;
                break;
            }
        }
        if (result) {
            result = stack.isEmpty();
        }
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void sortedTags() {
        var lines = List.of("#Java and #Scala it the best", "#Java and #Scala both are multiplatform", "Why  chose #Ruby or #Scala if you have another languages");
        Stream<Stream<String>> streamStream = lines.stream().map(s -> Arrays.stream(s.split(" ")).filter(s1 -> s1.startsWith("#")));
        Stream<String> stringStream = streamStream.flatMap(Function.identity());
        Map<String, Integer> stringIntegerHashMap = new HashMap<>();
        stringStream.forEach(s -> {
            if (stringIntegerHashMap.get(s) == null) {
                stringIntegerHashMap.put(s, 1);
            } else {
                stringIntegerHashMap.replace(s, stringIntegerHashMap.get(s) + 1);
            }

        });

        assertEquals(3, stringIntegerHashMap.size());
        LinkedHashMap<String, Integer> collect = stringIntegerHashMap.entrySet().stream()
                .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        collect.forEach((s, integer) -> System.out.println(s + integer));
    }

    @org.junit.jupiter.api.Test
    void reverseArray() {
        int[] array = {1, 3, 2, 5};
        int[] reversed = new int[array.length];
        int count = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversed[count] = array[i];
            count++;
        }
        Arrays.stream(reversed).forEach(System.out::println);

    }
    @org.junit.jupiter.api.Test
    void voidMethodCall(){
        Test test = new Test("Test",1);
        changeTest(test);
        assertEquals("New",test.getString());
    }

    private class Test {
        String string;
        int integer;

        public Test (String string, int integer){
            this.string = string;
            this.integer = integer;


        }

        public String getString(){
            return string;
        }

        public  void setString(String string){
            this.string = string;
        }

    }
    private void changeTest(Test test){
        test.setString("New");
    }

    @org.junit.jupiter.api.Test
    void missedNumber(){
        List<Integer> ints = List.of(1, 5, 3, 2, 7, 8, 10, 9,4);
        int x=0;
        for (int i = 1; i <= 10; i++) {
            x=x+i;
        }
        int y = 0;
        for (int i: ints
             ) {
            y+=i;
        }
        assertEquals(6,x-y);



    }

    @org.junit.jupiter.api.Test
    void oddNumbersSum(){
        List<Integer> ints = List.of(1, 5, 3, 2, 7, 8, 10, 9,4);
        Integer integer1 = ints.stream().filter(integer -> integer % 2 == 1).reduce(Integer::sum).get();
        int sum = ints.stream().flatMapToInt(IntStream::of).filter(integer -> integer % 2 == 1).sum();
        assertEquals(25,integer1);
        assertEquals(25,sum);

        List<Integer> odds = List.of(1,3,5,7,9);
        List<Integer> evens = List.of(2,4,6,8,10);
        List<List<Integer>> listOfLists = List.of(odds,evens);
        Integer integer3 = listOfLists.stream().flatMap(Collection::stream).reduce((integer, integer2) -> integer + integer2).get();
        assertEquals(55,integer3);

    }



}


