// Q5 a) WAP in java to create method that returns array

/*
    This program demonstrates how to create a method that returns an array in Java.
*/

public class J12 {
    // Method that returns an array of integers
    public int[] getArray() {
        // Creating and initializing an array
        int[] arr = {1, 2, 3, 4, 5};
        return arr; // Returning the array
    }

    public static void main(String[] args) {
        J12 obj = new J12();
        int[] array = obj.getArray(); // Calling the method that returns an array

        // Printing the elements of the array
        System.out.println("Array elements:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}