package com.learning.engineeringDigest.multiThreading.basics;

//start run sleep join set priority
public class Mythread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            Thread.currentThread().getState();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    static void main(String[] args) throws InterruptedException {
        Mythread m1 = new Mythread();
        System.out.println(m1.getState());
        m1.start();
        System.out.println(m1.getState());
        Thread.sleep(100);
        System.out.println(m1.getState());
        m1.join(); // First it will complete this and then it will complete the main thread
        System.out.println(m1.getState());
    }
}
