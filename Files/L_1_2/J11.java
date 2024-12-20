/*
  
  > Date Created: December 20, 2024
  > Author: Ishaan Rastogi
  > Purpose: To find out the largest number out of three numbers.
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working

*/

import java.util.Scanner;

public class J11 {
    public static void main(String[] args) {

        //Scanning the input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Approach 1

        /*
        The Wrong logic - This will only compare a with b because else if works when the first initial if is wrong.
        
        int max = a;
        
        if ( b > max ) {
            max = b;
        } else if ( c > max ) {
            max = c;
        }
        System.out.println("The largest number is: " + max);
        */

        // The Correct logic
        int max = a;
        
        if ( b > max ) {
            max = b;
        }
        if ( c > max ) {
            max = c;
        }
        System.out.println("The largest number is: " + max + " by approach 1");

        // Approach 2
        max = 0;

        if ( a > b ) {
            max = a;
        } else {
          max = b;
        }

        if ( c > max ) {
            max = c;
        }
        System.out.println("The largest number is: " + max + " by approach 2");

        // Approach 3
        max = a;
        if ( b > a && b > c ) {
            max = b;
        } else if ( c > a && c > b ) {
            max = c;
        }
        System.out.println("The largest number is: " + max + " by approach 3");

        // Approach 4 - Using inbuilt function

        max = Math.max (a, Math.max(b, c));
        System.out.println("The largest number is: " + max + " by approach 4");

    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename

*/