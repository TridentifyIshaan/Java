public class J24 {
    // Instance variables
    private String name;
    private int age;

    // Default constructor
    public J24() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public J24(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        J24 person1 = new J24();
        System.out.println("Details of person1:");
        person1.displayDetails();

        // Creating an object using the parameterized constructor
        J24 person2 = new J24("Alice", 25);
        System.out.println("\nDetails of person2:");
        person2.displayDetails();
    }
}