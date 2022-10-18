package com.deo.javalearning.collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class InterfaceComparable {
   static class Dog{
     private  Integer age;
       String name;
       String owner;
       String species;


        public Dog(Integer age, String name, String owner, String species) {
            this.age = age;
            this.name = name;
            this.owner = owner;
            this.species = species;
        }

       @Override
       public String toString() {
           return this.age+" "+this.name+" "+this.owner+" "+this.species;
       }
   }

    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog(1,"Spark","Mary","Husky"));
        dogs.add(new Dog(1,"Alpha","Dan","Husky"));
        dogs.add(new Dog(2,"Brut","John","Sheppard"));
        dogs.add(new Dog(2,"Pike","Sam","Bulldog"));
        dogs.add(new Dog(4,"Jessy","Kate","Shi-Tsu"));
        dogs.add(new Dog(1,"Rock","Ben","Terrier"));


        //need to create new comparator or implement interface Comparable<T>
        // to the Dog class for this actions

        Collections.sort(dogs, new Comparator<Dog>() {
            //custom logic
            @Override
            public int compare(Dog o1, Dog o2) {
                int result = o1.age.compareTo(o2.age);
                if(result ==0)                      //if age is equals
                return o1.name.compareTo(o2.name);  //objects will be sorted by names
                return result;
            }
        });


        for (Dog d : dogs) {
            System.out.println(d);
        }

    }

}
