package OOPs;
// Run Time Polymorphism aka method overriding - same function created in the parent and child class

// WAP to create a super class called Figure that stores the dimensions of a two-dimensional object. It also defines a method called area() that computes the area of an object. The program derives two subclasses from Figure. The first is Rectangle, and the second is Triangle. Each of these subclasses overrides area(), so that it returns the area of a rectangle and a triangle, respectively.

// Superclass Figure
class Figure {
    float dimension1;
    float dimension2;

    Figure(float dimension1, float dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    float area() {
        System.out.println("Area of Figure is undefined.");
        return 0;
    }
}

// Subclass Rectangle
class Rectangle extends Figure {
    Rectangle(float length, float breadth) {
        super(length, breadth);
    }

    // Override area() method
    float area() {
        return dimension1 * dimension2;
    }
}

// Subclass Triangle
class Triangle extends Figure {
    Triangle(float base, float height) {
        // super keyword is used to call the constructor of the superclass
        super(base, height);
    }

    // Override area() method
    float area() {
        return 0.5f * dimension1 * dimension2;
    }
}

// Main class
public class OOPs3 {
    public static void main(String[] args) {
        Figure fig = new Figure(10, 10);
        Rectangle rect = new Rectangle(9, 5);
        Triangle tri = new Triangle(10, 8);

        System.out.println("Area of Figure: " + fig.area());
        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Area of Triangle: " + tri.area());
    }
}
