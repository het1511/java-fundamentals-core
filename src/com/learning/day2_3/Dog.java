package com.learning.day2_3;

public class Dog extends Animal implements Drawable {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog Barks");
    }

    public void printName() {
        System.out.println(super.getName());
    }

    @Override
    public void draw() {
        System.out.println("Dog is drawing");
    }
}
