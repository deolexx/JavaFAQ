package com.deo.javalearning.multithreading;

public class WaitNotifyDemo {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

    }
}
class Q {
    int n;

    synchronized void put(int n) {
        System.out.println(n+" :inserted");
        this.n = n;
    }

    synchronized int get() {
        System.out.println(n+" :received");
        return n;
    }
}

class Consumer implements Runnable{
    Q q;

    public Consumer(Q q) {
        this.q = q;
        new Thread(this,"Consumer").start();

    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }
}

class Producer  implements Runnable{
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this,"Producer").start();
    }

    @Override
    public void run() {
        int i =0;
        while (true) {
            q.put(i++);
        }
    }
}