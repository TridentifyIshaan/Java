/*

  > Date Created: May 6, 2025
  > Author: Ishaan Rastogi
  > Purpose: To print all 3-digit Armstrong numbers
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working

  NOTES-
  Armstrong numbers are numbers that are equal to the sum of their own digits raised to the power of the number of digits.
  For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
  For example, 9474 is an Armstrong number because 9^4 + 4^4 + 7^4 + 4^4 = 9474.

*/

public class J28 {
    public static void main(String[] args) {
        for ( int i = 100; i < 1000; i++ ) {
            if ( isArmstrong(i)) {
                System.out.println(i + " ");
            }
        }
    }

    // Method to check if a number is prime
    static boolean isArmstrong(int n) {
        int originalNumber = n; // Store the original number for comparison later
        int sum = 0; // Initialize sum to 0

        while ( n > 0 ) {
            int rem = n % 10; // Get the last digit of the number
            n /= 10; // Remove the last digit from the number
            sum += Math.pow(rem, 3); // Add the cube of the last digit to the sum
        }

        return sum == originalNumber; // True or False according to the condition
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/