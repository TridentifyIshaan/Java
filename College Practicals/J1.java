// Q1 a) WAP in java to show method overloading

/*
    The add method is overloaded with three different signatures:
        add(int a, int b): Adds two integers.
        add(int a, int b, int c): Adds three integers.
        add(double a, double b): Adds two double values.

    The main method creates an instance of the J1 class & calls the overloaded add methods with different arguments to demonstrate method overloading.

*/

public class J1 {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        J1 obj = new J1();

        // Calling the add method with two integers
        System.out.println("Sum of 10 and 20: " + obj.add(10, 20));

        // Calling the add method with three integers
        System.out.println("Sum of 10, 20 and 30: " + obj.add(10, 20, 30));

        // Calling the add method with two double values
        System.out.println("Sum of 10.5 and 20.5: " + obj.add(10.5, 20.5));
    }
}