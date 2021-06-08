package com.deo.javalearning.multithreading;

public class MultipleThreads implements Runnable{
    String name;
    Thread t;


    MultipleThreads(String threadName) {
       name = threadName;
        t = new Thread(this,name);
        System.out.println("New thread: "+ t);
        t.start();
    }



    @Override
    public void run() {
        for (int i = 5; i >0 ; i--) {
            System.out.println(name+ ": "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name+ " ended");
    }
}

class MultipleThreadsDemo {
    public static void main(String[] args) {
        new MultipleThreads("One");
        new MultipleThreads("Two");
        new MultipleThreads("Three");
    }
}