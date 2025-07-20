/*
    This program demonstrates the use of a generic Map.
*/

import java.util.*;

public class J40 {
    public static void main(String[] args) {
        // Creating a generic Map with Integer keys and String values
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");
        map.put(5, "Elderberry");

        // Displaying the elements of the map
        System.out.println("Map elements:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Creating a generic Map with String keys and Integer values
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("One", 1);
        map2.put("Two", 2);
        map2.put("Three", 3);
        map2.put("Four", 4);
        map2.put("Five", 5);

        // Displaying the elements of the second map
        System.out.println("Map2 elements:");
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}