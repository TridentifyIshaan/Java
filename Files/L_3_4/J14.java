/*

  > Date Created: May 5, 2025
  > Author: Ishaan Rastogi
  > Purpose: To pass string values taken by user
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;

public class J14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        String message = greet(name);
        System.out.println(message);
    }

    static String greet (String name) {
        String message = "Hello " + name;
        return message;
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/