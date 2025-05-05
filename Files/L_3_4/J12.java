/*

  > Date Created: May 12, 2025
  > Author: Ishaan Rastogi
  > Purpose: To pass the values of 2 numbers when you are calling method in main and print their sum using functions
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;

public class J12 {
    // Static function makes its elements static also. Hence, line no. 24.
    public static void main(String[] args) {
        sum(10, 20); // Arguements for the values of 2 numbers
    }

    // Parameters for the values of 2 numbers
    static void sum ( int a, int b) {
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is " + sum);
    }
}
/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/