// Q2 a) WAP in java to show single level inheritance.

/*

    1. Animal Class: This is the superclass that defines a method sound() which prints a generic message.
    2. Dog Class: This subclass of Animal inherits the sound() method from the superclass and defines a new method bark() to print a message specific to dogs.
    3. J3 Class: This is the main class that creates an instance of Dog and calls its sound() and bark() methods to demonstrate single-level inheritance.

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

// Main class
public class J3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}