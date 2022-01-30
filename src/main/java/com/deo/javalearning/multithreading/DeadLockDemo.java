package com.deo.javalearning.multithreading;

public class DeadLockDemo {
    public static void main(String[] args) throws InterruptedException {

        Object resourceA = new Object();
        Object resourceB = new Object();

        Thread threadLockingResourceAFirst = new Thread(new DeadlockRunnable(resourceA, resourceB));
        Thread threadLockingResourceBFirst = new Thread(new DeadlockRunnable(resourceB, resourceA));

        threadLockingResourceAFirst.start();
        Thread.sleep(500);
        threadLockingResourceBFirst.start();


    }

    private static class DeadlockRunnable implements Runnable {
        private final Object firstResource;
        private final Object secondResource;

        public DeadlockRunnable(Object firstResource, Object secondResource) {
            this.firstResource = firstResource;
            this.secondResource = secondResource;
        }

        @Override
        public void run() {
            try {
                synchronized (firstResource){
                    printLockerResource(firstResource);
                    Thread.sleep(1000);
                    synchronized (secondResource){
                        printLockerResource(secondResource);
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Exception occured " + e);
            }
        }

        public static void printLockerResource(Object resource) {
            System.out.println(Thread.currentThread().getName() + ": locked resource -> " + resource);
        }
    }


}
