// Q3 a) WAP in java to show concept of multiple inheritance through implementation of interfaces in a class.

/*
    1. Interface A: This interface defines a method showA().
    2. Interface B: This interface defines a method showB().
    3. Class C: This class implements both Interface A and Interface B, demonstrating multiple inheritance.
*/

// Interface A
interface A {
    void showA();
}

// Interface B
interface B {
    void showB();
}

// Class C implementing both interfaces A and B
class C implements A, B {
    @Override
    public void showA() {
        System.out.println("This is showA method from Interface A");
    }

    @Override
    public void showB() {
        System.out.println("This is showB method from Interface B");
    }
}

// Main class
public class J7 {
    public static void main(String[] args) {
        C obj = new C();
        obj.showA(); // Calls showA method from Interface A
        obj.showB(); // Calls showB method from Interface B
    }
}