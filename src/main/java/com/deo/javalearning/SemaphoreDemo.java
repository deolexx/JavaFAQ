package com.deo.javalearning;

import java.util.Arrays;
import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) {

        Semaphore sem = new Semaphore(1);


        new IncThread("A",sem).start();
        new DecThread("B",sem).start();
    }
}
class Shared{
    static int count=0;
}
//Thread increasing value for 1
class IncThread extends Thread {
    String name;
    Semaphore sem;

    public IncThread(String name, Semaphore sem) {
        this.name = name;
        this.sem = sem;
    }

    @Override
    public void run() {
        System.out.println("Запуск потокa"+ name);
    try{
        //get permission
        System.out.println("Thread "+name+"waiting for permission");
        sem.acquire();
        System.out.println("Thread"+name+"permission received");
        //access to the shared resource
        for (int i=0;i<5;i++){
            Shared.count++;
            System.out.println(name+":"+Shared.count);
            //enable if possible context switching
            Thread.sleep(10);
        }

    }catch (InterruptedException e){
        System.out.println(Arrays.toString(e.getStackTrace()));
    }
    //release permission
        System.out.println("Thread "+name+" released permission");
        sem.release();
    }
}

//Thread decreasing value by 1
class DecThread extends Thread {
    String name;
    Semaphore sem;

    public DecThread(String name, Semaphore sem) {
        this.name = name;
        this.sem = sem;
    }

    @Override
    public void run() {
        System.out.println("Запуск потокa"+ name);
    try{
        //get permission
        System.out.println("Thread "+name+"waiting for permission");
        sem.acquire();
        System.out.println("Thread"+name+"permission received");
        //access to the shared resource
        for (int i=0;i<5;i++){
            Shared.count--;
            System.out.println(name+":"+Shared.count);
            //enable if possible context switching
            Thread.sleep(10);
        }

    }catch (InterruptedException e){
        System.out.println(Arrays.toString(e.getStackTrace()));
    }
    //release permission
        System.out.println("Thread "+name+" released permission");
        sem.release();
    }
}
