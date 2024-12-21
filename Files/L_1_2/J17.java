/*
  
  > Date Created: December 21, 2024
  > Author: Ishaan Rastogi
  > Purpose: To find if a number is palindrome or not
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working

*/

import java.util.Scanner;

public class J17 {
    public static void main(String[] args) {

        //Scanning the input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int original = n;

        int ans = 0;
        while ( n > 0 ) {
            int rem = n % 10;
            n /= 10;
            
            ans = ans * 10 + rem;
        }
        
        if ( original == ans) {
          System.out.println( original + " is a palindrome number");
        } else {
          System.out.println( original + " is not a palindrome number");
        }
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename

*/