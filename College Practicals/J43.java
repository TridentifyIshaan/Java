/*
    This program demonstrates how to compare elements in a collection.
*/

import java.util.*;
public class J43 {
    public static void main(String[] args) {
        // Creating a list and adding elements
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(40);

        // Finding the minimum element
        int minElement = Collections.min(list);
        System.out.println("Minimum element: " + minElement);

        // Finding the maximum element
        int maxElement = Collections.max(list);
        System.out.println("Maximum element: " + maxElement);

        // Sorting the list
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        // Reversing the list
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);
    }
}