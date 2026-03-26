package com.learning.engineeringDigest.InnerClasses.staticNested;

import java.lang.management.OperatingSystemMXBean;

public class Computer {
    private String brand;
    private String model;

    private OperatingSystem os;

//    Static Inner class
    static class USB {
        //Its not attached with any instance of class and will save memory
//        This will keep all classes related to one thing together
        private String type;

        public USB(String type) {
            this.type = type;
        }

        public void displayInfo() {
            System.out.println("something called USB");
        }
    }

    public Computer(String model, String brand, String osName) {
        this.model = model;
        this.brand = brand;
        this.os = new OperatingSystem(osName);
    }

    public OperatingSystem getOs() {
        return os;
    }

    class OperatingSystem {
        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        public void displayInfo() {
            System.out.println("Computer model:" + model + "OS: " + osName);
        }
    }
}
