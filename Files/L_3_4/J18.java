/*

  > Date Created: May 5, 2025
  > Author: Ishaan Rastogi
  > Purpose: To swap two numbers using a function [CORRECT APPROACH]
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;

public class J18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        swap(a, b); // calling the function to swap numbers
    }

    static void swap ( int a, int b) {
        // swapping numbers
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a + " and b = " + b); // This line's placement is important. This will swap the numbers.
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/