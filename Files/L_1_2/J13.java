/*
  
  > Date Created: December 20, 2024
  > Author: Ishaan Rastogi
  > Purpose: To find nth number of Fibonacci series
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working

*/

import java.util.Scanner;

public class J13 {
    public static void main(String[] args) {

        //Scanning the input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int a = 0, b = 1;
        int count = 2;
        
        while ( count <= n ) {
            int temp = b; // Storing the value of b in temp
            b += a; // Adding a to b
            a = temp; // Storing the value of temp (which has changed due the increment in the value of b) in a
            count++; // Incrementing the count
        }
        System.out.println("The " + n + "th number of Fibonacci series is: " + b);
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename

*/