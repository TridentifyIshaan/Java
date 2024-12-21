/*

  > Date Created: December 21, 2024
  > Author: Ishaan Rastogi
  > Purpose: To show if a day is a weekday or weekend using enhanced switch case
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;

public class J6 {
    public static void main(String[] args) {
        
        // Scanning the input
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
            
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/