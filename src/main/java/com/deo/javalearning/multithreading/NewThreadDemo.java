package com.deo.javalearning.multithreading;

public class NewThreadDemo implements Runnable {
    Thread t;
    NewThreadDemo(){
        //create new second thread
        t = new Thread(this, "DemoThread");
        System.out.println("Created additional thread"+ t);
        t.start();  //run new thread
    }
    @Override
    public void run() {
        for (int i = 5; i > 0 ; i--) {
            System.out.println("additionl thread" + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("additional thread ended");
            }
        }
        System.out.println("additional thread ended");
    }
}
class ThreadDemo{
    public static void main(String[] args) {
        new NewThreadDemo();//crate new Thread
        for (int i = 5; i > 0 ; i--) {
            System.out.println("Main thread"+ i );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Main thread ended");
    }
}