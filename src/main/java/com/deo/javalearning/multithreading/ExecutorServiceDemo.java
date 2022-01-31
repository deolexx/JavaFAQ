package com.deo.javalearning.multithreading;

import java.util.concurrent.*;

public class ExecutorServiceDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
//        Interface               Factory method
        ExecutorService service = Executors.newFixedThreadPool(3);

        Future future = service.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });
//
        service.execute(() -> System.out.println(Thread.currentThread().getName()));

//      main thread will wait until get() called, or timeout end
        future.get(1000, TimeUnit.MILLISECONDS);

        System.out.println(Thread.currentThread().getName());





    }

}
