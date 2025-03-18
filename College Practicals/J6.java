// Q2 d) WAP in java to show hybrid inheritance.

/*
    1. Animal Interface: This interface defines a method sound(). Interface is public and abstract by default, hence we are just creating a method signature.
    2. Mammal Class: This class implements the Animal interface and provides an implementation for the sound() method.
    3. Bird Class: This class implements the Animal interface and provides an implementation for the sound() method.
    4. Bat Class: This class extends Mammal and implements the Animal interface, demonstrating hybrid inheritance.
*/

// Interface
interface Animal {
    void sound();
}

// Class implementing Animal interface
class Mammal implements Animal {
    @ Override
    public void sound() {
        System.out.println("Mammal makes a sound");
    }
}

// Class implementing Animal interface
class Bird implements Animal {
    @Override
    public void sound() {
        System.out.println("Bird makes a sound");
    }
}

// Class extending Mammal and implementing Animal interface
class Bat extends Mammal {
    public void fly() {
        System.out.println("Bat can fly");
    }
}

// Main class
public class J6 {
    public static void main(String[] args) {
        Bat b = new Bat();
        b.sound(); // Inherited from Mammal
        b.fly();   // Defined in Bat
    }
}