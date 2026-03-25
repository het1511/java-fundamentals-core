package com.learning.engineeringDigest.staticKeyword;

public class Student {

    public static int count = 0; //JVM will directly call static without creating any object

    static {
        //Static blocks are used to setup one-time thing or logical code
    }

    private int id;
    private String name;
    public int age;

    public Student() {
        this.count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
