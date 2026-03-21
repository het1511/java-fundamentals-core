package com.learning.day2_3;

abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println("Vehicle Starting");
    }

    abstract void run();
}
