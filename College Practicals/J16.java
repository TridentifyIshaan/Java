import java.util.ArrayList;

public class J16 {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("ArrayList after adding elements: " + list);

        // Adding an element at a specific index
        list.add(1, "Blueberry");
        System.out.println("ArrayList after adding element at index 1: " + list);

        // Removing an element from the ArrayList
        list.remove("Banana");
        System.out.println("ArrayList after removing 'Banana': " + list);

        // Removing an element at a specific index
        list.remove(2);
        System.out.println("ArrayList after removing element at index 2: " + list);

        // Changing an element at a specific index
        list.set(1, "Blackberry");
        System.out.println("ArrayList after changing element at index 1: " + list);

        // Clearing all elements from the ArrayList
        list.clear();
        System.out.println("ArrayList after clearing all elements: " + list);
    }
}