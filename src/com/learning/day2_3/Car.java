package com.learning.day2_3;

public class Car extends Vehicle {

    Car(String brand) {
        super(brand);
    }

    @Override
    void run() {
        System.out.println("Car is running");
    }
}
