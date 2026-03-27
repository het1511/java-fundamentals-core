package com.learning.engineeringDigest.multiThreading.setPriority;

// Set Priority, Thread Interuppt, Yield
public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            String a = "";
            Thread.yield(); // It gives chance to another thread
            for (int j = 0; j < 100000; j++) {
                a += 'a';
            }
            System.out.println(Thread.currentThread().getName() + " Priority " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        MyThread l = new MyThread("Low Priority Thread");
        MyThread m = new MyThread("Med Priority Thread");
        MyThread h = new MyThread("High Priority Thread");

        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);

        l.start();
        // it interupts thread in between of running
        m.start();
        h.start();
//        System.out.println(t1.getName());
    }
}
