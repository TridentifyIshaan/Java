/*
    This program demonstrates the instance of a generic class.
*/

// Generic class
class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class J39 {
    public static void main(String[] args) {
        // Creating an instance of the generic class with Integer type
        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(123);
        System.out.println("Integer Value: " + integerBox.getValue());

        // Creating an instance of the generic class with String type
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello, Generics!");
        System.out.println("String Value: " + stringBox.getValue());
    }
}