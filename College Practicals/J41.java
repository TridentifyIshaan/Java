// Q21 c) Write a Java program to demonstrate Generic Set.

/*
    This program demonstrates the use of a generic Set in Java.
*/

import java.util.*;

public class J41 {
    public static void main(String[] args) {
        // Creating a generic Set of Integer type
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(10);
        integerSet.add(20);
        integerSet.add(30);
        integerSet.add(40);
        integerSet.add(50);

        // Displaying the elements of the integer set
        System.out.println("Integer Set: " + integerSet);

        // Creating a generic Set of String type
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Cherry");
        stringSet.add("Date");
        stringSet.add("Elderberry");

        // Displaying the elements of the string set
        System.out.println("String Set: " + stringSet);
    }
}