/*

  > Date Created: December 21, 2024
  > Author: Ishaan Rastogi
  > Purpose: To take input of 2 numbers and print their sum using functions
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

// DRY - Don't Repeat Yourself => Functions
// WET - Write Everything Twice => To learn the syntax and logic
// KISS - Keep It Simple Stupid => Simple Code
// YAGNI - You Ain't Gonna Need It => Don't write unnecessary code

import java.util.Scanner;

public class J8 {
    // Static function makes its elements static also. Hence, line no. 24.
    public static void main(String[] args) {
        sum();
    }

    // Non-Static Function can't be referenced from a static context, that's why we use static keyword for sum function here.
    static void sum () {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is " + sum);
    }
}
/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/