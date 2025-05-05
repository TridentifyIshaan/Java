// Q4 b) Write a program in Java to use final methods.

/*
    This program demonstrates the use of final methods in Java.
    Final methods cannot be overridden by subclasses.
*/

// Superclass
class Vehicle {
    // Final method
    public final void display() {
        System.out.println("This is a final method in the Vehicle class.");
    }
}

// Subclass
class Car extends Vehicle {
    // Attempting to override the final method will cause a compilation error
    /*
    public void display() {
        System.out.println("This is the display method in the Car class.");
    }
    */
}

public class J10 {
    public static void main(String[] args) {
        Car car = new Car();
        car.display(); // Calls the final method in the Vehicle class
    }
}