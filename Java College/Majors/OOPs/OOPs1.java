package OOPs;
// class is a blueprint for objects
class Pen {
    // instance variables -> Strings
    String color;
    String type;

    // instance methods / functions
    public void printColor () {
        //this refers to the current object
        System.out.println(this.color);
    }
}

//class 2
class Student {
    String name;
    int age;

    public void printInfo () {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Parameterized constructor
    Student (String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student (Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}

// main class
// class name same as file name
public class OOPs1 {
    // main method -> entry point of the program
    public static void main(String[] args) { // String[] args -> command line arguments
        
        // create an object of the class
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();

        // call the instance variables
        pen1.color = "Blue";
        pen1.type = "Gel";
        pen2.color =  "Black";
        pen2.type = "Ball point";
        
        // call the instance methods
        pen1.printColor();
        pen2.printColor();

        // Constructor -> special method to initialize the object
        // Same name as the class
        // Doesn't have a return type
        // Can be called using the new keyword only once
        
        // parameterized constructor
        //  Student s1 = new Student();
        //  s1.name = "Johnn";
        //  s1.age = 22;
        //  s1.printInfo();

        // non-parameterized constructor
        Student s1= new Student("John", 24);
        s1.printInfo();

        // Copy constructor
        Student s2 = new Student(s1);
        s2.printInfo();
    }
}