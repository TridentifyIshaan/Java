/*
  
  > Date Created: December 20, 2024
  > Author: Ishaan Rastogi
  > Purpose: To print out numbers 1 to n using simple for, while and do while loops.
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working

/*

NOTE-

Syntax of simple for loop:
for ( initialization; condition; decrement/increment ) {
    // body
}

Syntax of while loop:
while ( condition ) {
    // body
}

Syntax of do while loop:
do {
    // body
} while ( condition );

*/

import java.util.Scanner;

public class J10 {
    public static void main(String[] args) {

        //Scanning the input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number till which you have to print: ");
        int n = input.nextInt();
        
        // For Loop
        System.out.println("The numbers are: (Loop 1)");
        for ( int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        // While Loop
        System.out.println("The numbers are: (Loop 2)");
        int num = 1;
        while (num <= n) {
            System.out.println(num);
            num++;
        }

        // Do while Loop
        int a = 1;
        System.out.println("The numbers are: (Loop 3)");
        do {
          System.out.println(a);
          a++;
        } while ( a <= n );

        /*
        Concept of Do while loop
        The do while loop is used when you want to execute the loop at least once, no matter what the condition is.
        The do while loop is used when you want to execue the task first and then check the condition.
        */

        int b = 1;
        System.out.println("The output is: (Loop 4)");
        do {
          System.out.println("Hello World");
        } while ( b != 1 );
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename

*/