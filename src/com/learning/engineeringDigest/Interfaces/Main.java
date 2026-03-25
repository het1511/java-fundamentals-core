package com.learning.engineeringDigest.Interfaces;


import com.learning.engineeringDigest.Interfaces.animals.Animal;
import com.learning.engineeringDigest.Interfaces.animals.Dog;

public class Main {
    static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        System.out.println(Animal.MAX_AGE);
    }
}
