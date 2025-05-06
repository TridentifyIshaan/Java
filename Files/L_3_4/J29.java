/*

  > Date Created: May 6, 2025
  > Author: Ishaan Rastogi
  > Purpose: To check if a n-digit number is an Armstrong number
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working

  NOTES-
  Armstrong numbers are numbers that are equal to the sum of their own digits raised to the power of the number of digits.
  For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
  For example, 9474 is an Armstrong number because 9^4 + 4^4 + 7^4 + 4^4 = 9474.

*/

import java.util.Scanner;

public class J29 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Read an integer input from the user
        System.out.println("Enter a number to check if it is armstrong:");
        int n = sc.nextInt();
        
        // Call the isPrime method to check if the number is prime and print the result
        System.out.println(isArmstrong(n));
    }

    // Method to check if a number is prime
    static boolean isArmstrong(int n) {
        int originalNumber = n; // Store the original number for comparison later
        int sum = 0; // Initialize sum to 0
        // valueOf is used to convert a number passed in it to a string
        // and string has a method length() which returns the number of digits in the number
        int digits = String.valueOf(n).length();

        while ( n > 0 ) {
            int rem = n % 10; // Get the last digit of the number
            n /= 10; // Remove the last digit from the number
            sum += Math.pow(rem, digits); // Add the cube of the last digit to the sum
        }

        return sum == originalNumber; // True or False according to the condition
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/