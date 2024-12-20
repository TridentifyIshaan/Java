/*
  
  > Date Created: December 20, 2024
  > Author: Ishaan Rastogi
  > Purpose: To find the number of times a digit is present in a number
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working

*/

import java.util.Scanner;

public class J14 {
    public static void main(String[] args) {

        //Scanning the input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        System.out.println("Enter the digit to be found: ");
        int d = input.nextInt();

        int count = 0;
        while ( n > 0 ) {
            int rem = n % 10;
            if ( rem == d ) {
                count++;
                return;
            }
            n /= 10;
        }
        System.out.println("The digit " + d + " is present " + count + " times in the number.");
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename

*/