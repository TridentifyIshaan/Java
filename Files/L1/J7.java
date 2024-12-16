/*
  
  > Date Created: December 16, 2024
  > Author: Ishaan Rastogi
  > Purpose: To showcase loops in Java.
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;

public class J6 {
    public static void main(String[] args) {
        int a = 10;
        if ( a == 10 ) {
          System.out.println("Hello World");
        }

        int count = 1;
        while (count != 5) {
          System.out.println("Count is: " + count);
          count++;
        }

        for ( int i = 0; i < 5; i++ ) {
          System.out.println("Value of i is: " + i);
        }
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename

*/
