// Q3 b) WAP in java with given interfaces MotorBike and Cycle, then implement in child class TwoWheeler and display distance & speed.

/*
    1. MotorBike Interface: This interface defines a method showSpeed().
    2. Cycle Interface: This interface defines a method showDistance().
    3. TwoWheeler Class: This class implements both MotorBike and Cycle interfaces, demonstrating multiple inheritance.
*/

// Interface MotorBike
interface MotorBike {
    void showSpeed();
}

// Interface Cycle
interface Cycle {
    void showDistance();
}

// Class TwoWheeler implementing both interfaces MotorBike and Cycle
class TwoWheeler implements MotorBike, Cycle {
    // Instance variables are private by default
    // private variables can be accessed only within the class by methods of the class
    private int speed;
    private int distance;

    // Parameterized Constructor to initialize speed and distance
    public TwoWheeler(int speed, int distance) {
        this.speed = speed;
        this.distance = distance;
    }

    @Override
    public void showSpeed() {
        System.out.println("Speed: " + speed + " km/h");
    }

    @Override
    public void showDistance() {
        System.out.println("Distance: " + distance + " km");
    }
}

// Main class
public class J8 {
    public static void main(String[] args) {
        TwoWheeler tw = new TwoWheeler(80, 150);
        tw.showSpeed();    // Calls showSpeed method from MotorBike interface
        tw.showDistance(); // Calls showDistance method from Cycle interface
    }
}