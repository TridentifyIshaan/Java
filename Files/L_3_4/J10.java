/*

  > Date Created: March 1, 2025
  > Author: Ishaan Rastogi
  > Purpose: To return something using static function
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;

public class J10 {
    public static void main(String[] args) {
        greeting();
        // Now the returned value throught the function greeting will be printed
        System.out.println(greeting());
    }

    // if you want to return something, you write the data type of the return value
    static String greeting() {
        return "Hello, India!";
    }
}
/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/