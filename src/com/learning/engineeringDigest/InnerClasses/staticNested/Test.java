package com.learning.engineeringDigest.InnerClasses.staticNested;

public class Test {
    static void main(String[] args) {
        Computer computer = new Computer("Hp","ABC", "XYZ");
        computer.getOs().displayInfo();

//        Static inner class usage
        Computer.USB usb = new Computer.USB("Type-c");
    }
}
