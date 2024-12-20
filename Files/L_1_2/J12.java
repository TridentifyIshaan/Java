/*
  
  > Date Created: December 20, 2024
  > Author: Ishaan Rastogi
  > Purpose: To find out if a letter is uppercase or lowercase.
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working

*/

import java.util.Scanner;

public class J12 {
    public static void main(String[] args) {

        //Scanning the input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the alphabet: ");
        char c = input.next().trim().charAt(0); // input.next is taking a string, trim removes extra spaces and charAt(0) takes the first character.

        // The Logic
        if ( c >= 'A' && c <= 'Z' ) {
            System.out.println("The letter is uppercase.");
        } else if ( c >= 'a' && c <= 'z' ) {
            System.out.println("The letter is lowercase.");
        } else {
            System.out.println("Invalid Input.");
        }
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename

*/