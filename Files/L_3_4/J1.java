/*
  
  This note will be available only on first file of each folder present in folder Java .
  Documentation aka basic notes on how to run the code is already kept in each file for each programme using (/) or //.
  Wherever author needs it to be inserted, he has inserted. So that people using these files can learn easily how to code in Java Language. Author has made these programmes as a reference using courses of Kunal Kushwaha, while himself learning Java Language for the first time.
  
  > Date Created: December 21, 2024
  > Author: Ishaan Rastogi
  > Purpose: To describe the fruit name using switch case.
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
  NOTES-

  Switch case syntax:

  switch (expression) {
    case value1:
      // code block
      break;

    case value2:
      // code block
      break;

    default:
      // code block
  }

    ...
    Duplicate case is not allowed.

*/

import java.util.Scanner;

public class J1 {
    public static void main(String[] args) {            
        // Scanning input
        System.out.println("Enter the fruit name: ");
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        // Checking the fruit name
        switch ( fruit ) {
            case "Apple":
                System.out.println("A sweet red fruit.");
                break;
            case "Banana":
                System.out.println("A long yellow fruit.");
                break;
            case "Mango":
                System.out.println("King of fruits.");
                break;
            case "Grapes":
                System.out.println("Small fruit in bunches.");
                break;
            case "Orange":
                System.out.println("A round orange fruit.");
                break;
            case "Pineapple":
                System.out.println("A tropical yellow fruit.");
                break;
            case "Guava":
                System.out.println("A round green fruit.");
                break;
            case "Papaya":
                System.out.println("A long orange fruit.");
                break;
            case "Watermelon":
                System.out.println("A big green fruit.");
                break;
            case "Kiwi":
                System.out.println("A small brown fruit, matching it's name with a bird.");
                break;
            case "Sapodilla": // Chikoo
                System.out.println("A small brown fruit.");
                break;
            case "Pomegranate":
                System.out.println("A red fruit with juicy seeds.");
                break;
            case "Strawberry":
                System.out.println("A red fruit with seeds outside.");
                break;
            case "Blueberry":
                System.out.println("A small blue fruit.");
                break;
            case "Raspberry":
                System.out.println("A small red fruit.");
                break;
            case "Blackberry":
                System.out.println("A small black fruit.");
                break;
            case "Lychee":
                System.out.println("A small soft white fruit from inside with red peel.");
                break;
            default:
                System.out.println("Sorry, we don't have this fruit.");
        }
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/