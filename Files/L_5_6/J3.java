/*
  
  > Date Created: May 06, 2025
  > Author: Ishaan Rastogi
  > Purpose: To print the character array of string
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;
import java.util.Arrays;

public class J3 {
    public static void main(String[] args) {            

        // Scanning the input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();

        // toCharArray() converts the string to character array & toString() converts the character array into a string but with array-like format.
        System.out.println("Array of characters in the string: " + Arrays.toString( str.toCharArray() ) );
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/