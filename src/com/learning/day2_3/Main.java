package com.learning.day2_3;

public class Main {
    public static void main(String[] args) {

        //Regular constructor
        Animal a1 = new Animal("Rocky");
//        a1.makeSound();

        //Runtime Polymorphism - Method execution depends on OBJECT type, not reference type
        Animal a2 = new Dog("PolyRocky");
//        a2.makeSound();

        //
        Animal[] animals = {
                new Dog("D1"),
                new Cat("C1"),
                new Dog("D2")
        };

// One loop handles all objects using a common parent type (Animal)
// Method execution is determined at runtime based on the actual object type
// This concept is called Dynamic Binding (Runtime Polymorphism)

        for (Animal a : animals) {
            System.out.println(a.getClass().getSimpleName());
//            a.makeSound();
//            instanceof is used to check the actual object type at runtime
//            before performing casting, to avoid ClassCastException.
//            Parent → Child IF object is actually that child
            if (a instanceof Dog) {
                Dog d = (Dog) a;
                d.printName();
            }
        }


        /*                 Day 3                 */
//        Interface polymorphism
//	•	Reference type = Drawable
//	•	Object type = Dog
//	•	Method called = Dog.draw()

        Drawable d = new Dog("SketchDog");
        d.draw();


//        Abstraction defines a contract (what to do),
//        while polymorphism allows different implementations of
//        that contract at runtime.

//        Abstraction        Hides implementation     abstract void run()
//        Polymorphism      Same method, different behavior     v.run() calls Car

        //Abstract Class:
        Vehicle v = new Car("BMW");
        v.start();
        v.run();



    }
}
