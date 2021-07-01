package com.deo.javalearning.generics;
interface MinMax<T extends Comparable<T>>{
    T min();
    T max();
}
public class GenInterfaces <T extends Comparable<T>>implements MinMax<T>{
   private T [] vals;

    public GenInterfaces(T[] o) {
        vals = o;
    }

    @Override
    public T min() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if(vals[i].compareTo(v)< 0) v = vals[i];
        }
        return v;
    }

    @Override
    public T max() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if(vals[i].compareTo(v)> 0) v = vals[i];
        }
        return v;
    }
    }
class GenInDemo{
    public static void main(String[] args) {
        Integer nums [] = {1,2,3,4,};
        Character cha [] = {'a','b','c'};

        GenInterfaces test1 = new GenInterfaces(nums);
        GenInterfaces test2 = new GenInterfaces(cha);
        System.out.println(test1.min());
        System.out.println(test1.max());
        System.out.println(test2.min());
        System.out.println(test2.max());

    }
}

