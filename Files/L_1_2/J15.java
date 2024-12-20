/*
  
  > Date Created: December 20, 2024
  > Author: Ishaan Rastogi
  > Purpose: To reverse a number
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working

*/

import java.util.Scanner;

public class J15 {
    public static void main(String[] args) {

        //Scanning the input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        int ans = 0;
        while ( n > 0 ) {
            int rem = n % 10;
            n /= 10;
            
            ans = ans * 10 + rem;
        }
        System.out.println("The reversed number is: " + ans);
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename

*/