// Q2 c) WAP in java to show heirarchal inheritance.

/*
    1. Animal Class: This is the superclass that defines a method sound() which prints a generic message.
    2. Dog Class: This subclass of Animal inherits the sound() method from the superclass and defines a new method bark() to print a message specific to dogs.
    3. Cat Class: This subclass of Animal inherits the sound() method from the superclass and defines a new method meow() to print a message specific to cats.
    4. J5 Class: This is the main class that creates instances of Dog and Cat and calls their sound() methods to demonstrate heirarchal inheritance.
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
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// Main class
public class J5 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();

        Cat c = new Cat();
        c.sound();
        c.meow();
    }
}