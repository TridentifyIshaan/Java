/*

  > Date Created: December 21, 2024
  > Author: Ishaan Rastogi
  > Purpose: To show if a day is a weekday or weekend using normal switch case
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;

public class J5 {
    public static void main(String[] args) {
        
        // Scanning the input
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
            
            switch (day) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Weekday");
                    break;
                case 6:
                case 7:
                    System.out.println("Weekend");
                    break;
            }
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/