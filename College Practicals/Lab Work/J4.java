// Q2 b) WAP in java to show multi-level inheritance.

/*
    
    1. Animal Class: This is the superclass that defines a method sound() which prints a generic message.
    2. Dog Class: This subclass of Animal inherits the sound() method from the superclass and defines a new method bark() to print a message specific to dogs.
    3. Puppy Class: This subclass of Dog inherits the sound() and bark() methods from the superclass and defines a new method weep() to print a message specific to puppies.
    4. J4 Class: This is the main class that creates an instance of Puppy and calls its sound(), bark(), and weep() methods to demonstrate multi-level inheritance.

*/

// Superclass
class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}

// Subclass
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Subclass
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

// Main class
public class J4 {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.sound();
        p.bark();
        p.weep();
    }
}