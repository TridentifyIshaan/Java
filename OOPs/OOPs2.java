package OOPs;
// Polymorphism
// Compile time polymorphism aka method overloading - different functions created with the same name

class Shape {
    // Method to calculate area of a rectangle
    double area(double length, double breadth) {
        return length * breadth;
    }

    // Method to calculate area of a triangle
    double area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return 0;
    }

    // Method to calculate area of a circle
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to draw a rectangle
    void draw(double length, double breadth) {
        System.out.println("Drawing a rectangle with length " + length + " and breadth " + breadth);
    }

    // Method to draw a triangle
    void draw(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            System.out.println("Drawing a triangle with base " + base + " and height " + height);
        }
    }

    // Method to draw a circle
    void draw(double radius) {
        System.out.println("Drawing a circle with radius " + radius);
    }
}

public class OOPs2 {
    public static void main(String[] args) {
        Shape shape = new Shape();

        // Calculate and draw area of a rectangle
        double rectangleArea = shape.area(10, 5);
        System.out.println("Area of Rectangle: " + rectangleArea);
        shape.draw(10, 5);

        // Calculate and draw area of a triangle
        double triangleArea = shape.area(10, 8, true);
        System.out.println("Area of Triangle: " + triangleArea);
        shape.draw(10, 8, true);

        // Calculate and draw area of a circle
        double circleArea = shape.area(7);
        System.out.println("Area of Circle: " + circleArea);
        shape.draw(7);
    }
}