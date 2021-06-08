package com.deo.javalearning.multithreading;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);
        t.setName("My Thread");
        System.out.println(t);
        for (int i = 5; i >0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Main thread stopped");
            }
        }

    }
}
