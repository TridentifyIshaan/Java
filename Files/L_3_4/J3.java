/*

  > Date Created: December 21, 2024
  > Author: Ishaan Rastogi
  > Purpose: To showcase enhanced switch case
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {            
        // Scanning input
        System.out.println("Enter the fruit name: ");
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        // Checking the fruit name
        switch ( fruit ) {
            case "Apple" -> System.out.println("A sweet red fruit.");
            case "Banana" -> System.out.println("A long yellow fruit.");
            case "Mango" -> System.out.println("King of fruits.");
            case "Grapes" -> System.out.println("Small fruit in bunches.");
            case "Orange" -> System.out.println("A round orange fruit.");
            case "Pineapple" -> System.out.println("A tropical yellow fruit.");
            case "Guava" -> System.out.println("A round green fruit.");
            case "Papaya" -> System.out.println("A long orange fruit.");
            case "Watermelon" -> System.out.println("A big green fruit.");
            case "Kiwi" -> System.out.println("A small brown fruit, matching it's name with a bird.");
            case "Sapodilla" -> System.out.println("A small brown fruit."); // Chikoo
            case "Pomegranate" -> System.out.println("A red fruit with juicy seeds.");
            case "Strawberry" -> System.out.println("A red fruit with seeds outside.");
            case "Blueberry" -> System.out.println("A small blue fruit.");
            case "Raspberry" -> System.out.println("A small red fruit.");
            case "Blackberry" -> System.out.println("A small black fruit.");
            case "Lychee" -> System.out.println("A small soft white fruit from inside with red peel.");
            default -> System.out.println("Sorry, we don't have this fruit.");
        }
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/