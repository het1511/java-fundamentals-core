package com.learning.day2_3;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void makeSound() {
        System.out.println(this.name + " makes sound");
    }
}
