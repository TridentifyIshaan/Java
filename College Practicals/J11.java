// Q4 c) Write a program in Java to use final classes.

/*
    This program demonstrates the use of final classes in Java.
    Final classes cannot be extended by other classes.
*/

// Final class
final class Vehicle {
    void display() {
        System.out.println("This is a final class Vehicle.");
    }
}

// The following class declaration will cause a compilation error
// class Car extends Vehicle { } // Error: cannot inherit from final Vehicle

public class J11 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.display();
    }
}