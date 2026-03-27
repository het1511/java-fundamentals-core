package com.learning.engineeringDigest.multiThreading.basics;

public class World extends Thread implements Runnable{
    @Override
    public void run() {
        System.out.println("World" + World.currentThread().getName());
    }
}
