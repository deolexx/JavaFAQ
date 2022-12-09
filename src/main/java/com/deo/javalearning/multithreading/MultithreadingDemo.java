package com.deo.javalearning.multithreading;


import java.util.concurrent.*;

public class MultithreadingDemo {
   static int counter =0;


    public synchronized static void count(){
        counter++;
        System.out.println(
                Thread.currentThread().getName()+" : "+
                counter);

    }

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {


        ExecutorService service = Executors.newFixedThreadPool(2);




        Future task = service.submit(() -> {
            while (counter<100){
                count();
            }
        });

        Future task2 = service.submit(() -> {
            while (counter<100){
                count();
            }
        });




    }




}
