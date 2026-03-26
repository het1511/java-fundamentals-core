package com.learning.engineeringDigest.InnerClasses.member;

public class Car {
    private String model;
    private boolean isEngineOn;

    public Car(String model) {
        this.model = model;
        this.isEngineOn = false;
    }

//    Inner class will behave as member of this class
    class Engine {
        void start() {
            if (!isEngineOn) {
                isEngineOn = true;
                System.out.println(model  + " Engine Started");
            } else {
                System.out.println(model  + " Engine Already on");
            }
        }

        void off() {
            if (isEngineOn) {
                isEngineOn = false;
                System.out.println(model  + " Engine Stopped");
            } else {
                System.out.println(model  + " Engine Already off");
            }
        }
    }
}
