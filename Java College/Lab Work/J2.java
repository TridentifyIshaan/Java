// Q1 b) WAP in java to show method overriding

/*
    1. Animal Class: This is the superclass that defines a method sound() which prints a generic message.
    2. Dog Class: This subclass of Animal overrides the sound() method to print a message specific to dogs.
    3. Cat Class: This subclass of Animal overrides the sound() method to print a message specific to cats.
    4. J2 Class: This is the main class that creates instances of Animal, Dog, and Cat, and calls their sound() methods to demonstrate method overriding.

*/

// Superclass
class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass
class Cat extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class J2 {
    public static void main(String[] args) {
        Animal A = new Animal();    // Create an Animal object
        Animal D = new Dog();       // Create a Dog object
        Animal C = new Cat();       // Create a Cat object

        A.sound();    // Calls the method in Animal class
        D.sound();    // Calls the overridden method in Dog class
        C.sound();    // Calls the overridden method in Cat class
    }
}