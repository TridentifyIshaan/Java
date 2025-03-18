// Q5 b) WAP in java to pass array as parameter

/*
    This program demonstrates how to pass an array as a parameter to a method in Java.
*/

public class J13 {
    // Method that takes an array as a parameter and prints its elements
    public void printArray(int[] arr) {
        System.out.println("Array elements:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        J13 obj = new J13();
        // Creating and initializing an array
        int[] array = {1, 2, 3, 4, 5};
        // Passing the array as a parameter to the printArray method
        obj.printArray(array);
    }
}