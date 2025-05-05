// Define a custom exception
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class J22 {
    // Method to demonstrate the usage of custom exception
    public static void validateAge(int age) throws CustomException {
        if (age < 18) {
            // Throwing a custom exception
            throw new CustomException("Age must be 18 or above.");
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
        } catch (CustomException e) {
            System.out.println("CustomException caught: " + e.getMessage());
        }
    }
}