package com.learning.engineeringDigest.multiThreading.daemonExample;

// Set Daemon Thread
public class MyThread extends Thread{

    @Override
    public void run() {
        while (true) {
            System.out.println("a");
        }
    }

    static void main(String[] args) {
        MyThread myThread = new MyThread(); //User Thread - Business logic is getting done through a particular thread
        myThread.start();
        myThread.setDaemon(true);
        System.out.println("Main Done!!");
        //Daemon Threads - which runs in background and will terminate if the user thread or main thread is terminated

    }
}
