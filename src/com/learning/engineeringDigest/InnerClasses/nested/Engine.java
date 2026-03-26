package com.learning.engineeringDigest.InnerClasses.nested;

public class Engine {

    private Car car;

    public Engine(Car car) {
        this.car = car;
    }

    void start() {
        if (!car.isEngineOn()) {
            car.setEngineOn(true);
            System.out.println(car.getModel() + " Engine Started");
        } else {
            System.out.println(car.getModel() + " Engine Already on");
        }
    }

    void off() {
        if (car.isEngineOn()) {
            car.setEngineOn(false);
            System.out.println(car.getModel() + " Engine Stopped");
        } else {
            System.out.println(car.getModel() + " Engine Already off");
        }
    }
}
