package com.deo.javalearning.collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<>();

        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.addLast("Spain");
        states.addFirst("Netherlands");
        states.add(1, "Romania");


        System.out.printf("States has %d elements inside", states.size());
        System.out.println(states.get(1));
        states.set(1, "Portugal");
        for (String s : states) {
            System.out.println(s);
        }

        // проверка на наличие элемента в списке
        if (states.contains("Germany")) {

            System.out.println("List contains Germany");
        }

        states.remove("Germany");
        states.removeFirst(); // удаление первого элемента
        states.removeLast(); // удаление последнего элемента

    }


}
