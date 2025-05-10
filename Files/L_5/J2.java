/*
  
  > Date Created: May 06, 2025
  > Author: Ishaan Rastogi
  > Purpose: To search an element in a string using linear search algorithm.
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;

public class J2 {
    public static void main(String[] args) {            

        // Scanning the input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();

        // Taking target
        System.out.println("Enter the character to be searched: ");
        char x = sc.next().charAt(0);

        // Calling the function to search in the string
        linearSearch(str, x);
    }

    // Function to search in the string
    static void linearSearch( String str, char x) {
        // to run the for loop for each element of the string and check if the element is present in the array or not

        if ( str.length() == 0 ) {
            System.out.println("String is empty.");
            return;
        }

        for ( int i = 0; i < str.length(); i++) {
            if ( str.charAt(i) == x ) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        // if the element is not found in the array, then print this message
        System.out.println("Element not found in the array.");
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/