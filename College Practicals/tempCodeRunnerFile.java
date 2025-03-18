public class J19 {
    // Method to demonstrate the usage of throw keyword
    public static void validateAge(int age) {
        if (age < 18) {
            // Throwing an exception using throw keyword
            throw new IllegalArgumentException("Age must be 18 or above.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        try {
            // Valid age
            validateAge(20);
            
            // Invalid age
            validateAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}