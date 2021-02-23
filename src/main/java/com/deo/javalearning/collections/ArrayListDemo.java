package com.deo.javalearning.collections;

import java.util.ArrayList;

public class ArrayListDemo {


    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();
        // добавим в список ряд элементов
        people.add("Mark");
        people.add("Bob");
        people.add("Dan");
        people.add("Sam");
        people.add("Lisa");
        people.add("Mary");
        people.add("Sara");

        people.add(0,"Dany");   // добавляем элемент по индексу 0

        System.out.println(people.get(2)); // получаем 2-й объект

        System.out.printf("Array list has %d elements\n",people.size());


        for(String person : people){

            System.out.println(person);
        }
        // проверяем наличие элемента
        if(people.contains("Lisa")){

            System.out.println("ArrayList contains Lisa");
        }

        // удаление конкретного элемента
        people.remove("Sam");
        // удаление по индексу
        people.remove(4);


        Object[] peopleArray = people.toArray();
        for (Object o : peopleArray) {
            System.out.println(o);
        }



    }

}
