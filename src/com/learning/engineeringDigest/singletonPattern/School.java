package com.learning.engineeringDigest.singletonPattern;

//Just to have only one object for a particular class
public class School {

    private static School instance;

    private School() {

    }
    public static School getInstance() {
        if (instance == null) {
            instance = new School();
        }

        return instance;
    }
}
