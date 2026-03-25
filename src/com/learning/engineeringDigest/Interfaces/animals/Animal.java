package com.learning.engineeringDigest.Interfaces.animals;

//Interface: Multiple Inheritance and pure abstraction
//Class is blueprint of object and interface is blueprint of class
//It contains by default abstract methods as well as static constants, methods and default methods as well

//We can achieve const by FINAL keyword


public interface Animal {

    int MAX_AGE = 15;

    //Modifier abstract is redundant
    public abstract void eat();

    void sleep();

    public static void info() {
        System.out.println("This is Animal Interface");
        //If its not static then there should be no body
//        this is used to explain the complexity of Interface logic
//        Mainly interface is used to have static methods
//        No need to oveerride in class which is implemented
    }

//    Default Methods in interface
//    Use:
//    1. When you have to implement without breaking through instance of class
//    2.
    default void run() {
        System.out.println("Animal is running");
    }
}
