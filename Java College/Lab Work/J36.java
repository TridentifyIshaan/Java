// Q18 b) Create custom annotations in java.

/*
    This program demonstrates how to create and use custom annotations in Java.
*/

// Define a custom annotation
@interface MyAnnotation {
    String value();
}

// Use the custom annotation in a class
class MyClass {
    @MyAnnotation(value = "Hello, Annotation!")
    public void myMethod() {
        System.out.println("My method is called.");
    }
}

public class J36 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.myMethod();

        // Access the custom annotation
        try {
            MyAnnotation annotation = obj.getClass().getMethod("myMethod").getAnnotation(MyAnnotation.class);

            if (annotation != null) {
                System.out.println("Annotation value: " + annotation.value());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}