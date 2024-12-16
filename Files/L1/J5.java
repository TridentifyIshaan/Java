/*
  
  > Date Created: December 16, 2024
  > Author: Ishaan Rastogi
  > Purpose: To add two numbers and print the sum.
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;

public class J5 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num1 = input.nextInt();
      int num2 = input.nextInt();

      int sum = num1 + num2;

      System.out.println("The sum of the two numbers is " + sum);
      }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename

*/
