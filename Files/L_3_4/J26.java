/*

  > Date Created: May 6, 2025
  > Author: Ishaan Rastogi
  > Purpose: To print prime numbers using functions
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working

*/

import java.util.Scanner;

public class J26 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Read an integer input from the user
        System.out.println("Enter a number to check if it is prime:");
        int n = sc.nextInt();
        
        // Call the isPrime method to check if the number is prime and print the result
        System.out.println(isPrime(n));
    }

    // Method to check if a number is prime
    static boolean isPrime(int n) {
        // If the number is less than or equal to 1, it is not prime
        if (n <= 1) {
            return false;
        }
        
        // Initialize a counter variable to 2 (smallest prime number)
        int c = 2;
        
        // Square root of the number is used to reduce the number of iterations
        // This is because if n is divisible by any number greater than its square root, it must also be divisible by a number smaller than its square root

        // Loop to check divisors up to the square root of the number
        while (c * c <= n) {
            // If the number is divisible by c, it is not prime
            if (n % c == 0) {
                return false;
            }
            // Increment the counter
            c++;
        }
        
        return c * c > n; // True or False according to the condition
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/