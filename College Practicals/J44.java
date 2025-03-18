// Q22 c) Write a Java Program to Rotate Elements of the List

/*
    This program demonstrates how to rotate elements of a list in Java.
*/

import java.util.*;
public class J44 {
    public static void main(String[] args) {
        // Creating a list and adding elements
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Displaying the original list
        System.out.println("Original list: " + list);

        // Rotating the list by 2 positions
        Collections.rotate(list, 2);

        // Displaying the rotated list
        System.out.println("Rotated list: " + list);
    }
}