/*
    This program demonstrates how to delete a given element from a DLL in Java.
*/

import java.util.*;

public class J38 {
    public static void main(String[] args) {
        // Creating a doubly linked list of elements
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Displaying the original list
        System.out.println("Original list: " + list);

        // Element to be deleted
        int elementToDelete = 30;

        // Deleting the given element from the list
        boolean removed = list.remove((Integer) elementToDelete);

        // Displaying the result of deletion
        if (removed) {
            System.out.println("Element " + elementToDelete + " deleted from the list.");
        } else {
            System.out.println("Element " + elementToDelete + " not found in the list.");
        }

        // Displaying the contents of the list after deletion
        System.out.println("List after deletion: " + list);
    }
}