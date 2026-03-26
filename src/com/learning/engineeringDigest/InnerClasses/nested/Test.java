package com.learning.engineeringDigest.InnerClasses.nested;

public class Test {
    static void main(String[] args) {
        Car car = new Car("Fronx");
        Engine engine = new Engine(car);

        engine.start();
        engine.off();
    }
}
