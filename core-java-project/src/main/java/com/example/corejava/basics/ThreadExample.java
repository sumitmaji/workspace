package com.example.corejava.basics;

/**
 * Demonstrates basic threading in Java
 */
public class ThreadExample {
    public static void demonstrate() {
        System.out.println("Thread Example:");
        Thread t1 = new MyThread("Thread-1");
        Thread t2 = new Thread(new MyRunnable(), "Thread-2");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("  Main thread interrupted");
        }
    }
}
class MyThread extends Thread {
    public MyThread(String name) { super(name); }
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("  " + getName() + " running: " + i);
        }
    }
}
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("  " + Thread.currentThread().getName() + " running: " + i);
        }
    }
}
