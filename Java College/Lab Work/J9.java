// Q4 a) Write a program in Java to use final variables.

/*
    This program demonstrates the use of final variables in Java.
    Final variables are constants whose values cannot be changed once initialized.
*/

public class J9 {
    // Final variable
    final int MAX_SPEED = 120;

    public static void main(String[] args) {
        J9 obj = new J9();
        System.out.println("The maximum speed is: " + obj.MAX_SPEED);

        // obj.MAX_SPEED = 150; // Compile-time Error
    }
}