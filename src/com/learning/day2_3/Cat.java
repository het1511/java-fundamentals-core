package com.learning.day2_3;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }

    public void printName() {
        System.out.println(super.getName());
    }
}