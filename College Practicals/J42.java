/*
    This program demonstrates binary search on a Vector.
*/

import java.util.*;
public class J42 {
    public static void main(String[] args) {
        // Creating a Vector and adding elements
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        // Sorting the Vector
        Collections.sort(vector);

        // Element to be searched
        int key = 30;

        // Performing binary search
        int index = Collections.binarySearch(vector, key);

        // Displaying the result
        if (index >= 0) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found.");
        }
    }
}