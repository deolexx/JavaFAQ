package com.deo.javalearning.multithreading;

import java.util.concurrent.*;

public class ExecutorServiceDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        ExecutorService service = Executors.newFixedThreadPool(3);

        Future future = service.submit(()->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName());
        });

        service.execute(() -> System.out.println(Thread.currentThread().getName()));

//      main thread will wait until get() called, or timeout end
        future.get(6, TimeUnit.SECONDS);

        System.out.println(Thread.currentThread().getName());





    }

}
