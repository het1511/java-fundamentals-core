package com.learning.engineeringDigest.staticKeyword;

public class Main {
    static void main(String[] args) {

// The Static method can not use non-static data member or call non-static method directly.
        sum(8,10);
//        This and super cannot be used as this refers to object and super refers to parent.    q
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
