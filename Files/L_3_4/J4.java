/*

  > Date Created: December 21, 2024
  > Author: Ishaan Rastogi
  > Purpose: To display the name of the day of the week
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;

public class J4 {
    public static void main(String[] args) {
        
        // Scanning the input
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
            
            switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Day");
        }
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/