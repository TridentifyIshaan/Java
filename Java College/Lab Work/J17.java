/*
    1. ArithmeticException: This exception is thrown when an arithmetic operation is attempted with illegal arguments, such as division by zero.

    2. NumberFormatException: This exception is thrown when an attempt is made to convert a string to a numeric type, but the string does not have the appropriate format.

    3. ArrayIndexOutOfBoundsException: This exception is thrown when an attempt is made to access an array element with an illegal index.

    4. Finally Block: The finally block is executed after the try and catch blocks, regardless of whether an exception was thrown or not. It is typically used for cleanup code.
*/

public class J17 {
    public static void main(String[] args) {
        // Demonstrating ArithmeticException
        try {
            int result = 10 / 0; // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after ArithmeticException.");
        }

        // Demonstrating NumberFormatException
        try {
            int number = Integer.parseInt("abc"); // This will cause NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after NumberFormatException.");
        }

        // Demonstrating ArrayIndexOutOfBoundsException
        try {
            int[] array = new int[5];
            int value = array[10]; // This will cause ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after ArrayIndexOutOfBoundsException.");
        }
    }
}