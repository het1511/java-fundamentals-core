package com.learning.engineeringDigest.protectedAccess;

public class Test {
    static void main(String[] args) {
        Dog dog = new Dog("Bob");
        dog.makeSound();
        dog.setDogSound("Woof");
        dog.makeSound();
    }
}
