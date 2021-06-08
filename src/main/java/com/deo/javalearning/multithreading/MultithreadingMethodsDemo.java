package com.deo.javalearning.multithreading;

public class MultithreadingMethodsDemo extends Thread{
    @Override
    public void run() {
        for (int i = 5; i > 0 ; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MultithreadingMethodsDemo th1  = new MultithreadingMethodsDemo();
        System.out.println(th1.getName());  //return thread name
        System.out.println(th1.getPriority());  //return thread priority from 0 to 10
        System.out.println(th1.isAlive());  //returns true if thread currently is running
        System.out.println(th1); //thread info
        th1.start();    //start new thread by calling its .run() method
        System.out.println(th1.isAlive());
        th1.sleep(1000); //stop thread for n milliseconds, throws Interrupted Exception

    }






}
