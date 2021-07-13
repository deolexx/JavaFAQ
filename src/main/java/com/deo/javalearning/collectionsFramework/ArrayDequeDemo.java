package com.deo.javalearning.collectionsFramework;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> states = new ArrayDeque<>();
        // стандартное добавление элементов
        states.add("Germany");
        states.addFirst("France");  // добавляем элемент в самое начало
        states.push("Italy");       // добавляем элемент в самое начало
        states.addLast("Spain");    // добавляем элемент в конец коллекции
        states.add("Greece");

        // получаем первый элемент без удаления
        String sFirst = states.getFirst();
        System.out.println(sFirst);     // Great Britain
        // получаем последний элемент без удаления
        String sLast = states.getLast();
        System.out.println(sLast);      // Italy


        System.out.printf("Queue size: %d \n", states.size());  // 5

        // перебор коллекции
        while(states.peek()!=null){
            // извлечение c начала
            System.out.println(states.pop());
        }


    }



}
