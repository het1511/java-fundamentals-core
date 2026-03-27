package com.learning.engineeringDigest.multiThreading.basics;

/*
Thread Lifecycle

New - Thread Created but not started
Runnable - Thread is running or started
Blocked/Waiting - waiting for a thread to perform or waiting for a resource to perform
Terminated - Thread gets killed after performing.

How to create a thread:
First extend Thread or implement thread
if extend create object in main and start
if implemented create object of class, create object of thread and threadinstance.start().


 */

public class Test {
//    Main Thread
    static void main(String[] args) {
        //1st Thread is always main
        System.out.println("Hello" + Thread.currentThread().getName());

        //2nd Thread
        World newWorld = new World();
        newWorld.start();

        //3rd Thread through interface
        Thread t1 = new Thread(newWorld);
        t1.start();

    }
}
