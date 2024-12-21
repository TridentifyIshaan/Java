/*

  > Date Created: December 21, 2024
  > Author: Ishaan Rastogi
  > Purpose: To create calculator using switch case
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

*/

import java.util.Scanner;

public class J2 {
    public static void main(String[] args) {

        // Scanning the input
        Scanner input = new Scanner(System.in);
        
        // Taking the input from user till user doesn't press X or x.
        // infinite loop
        while (true) {
            
            System.out.print("Enter the operator: ");
            char op = input.next().trim().charAt(0);
            
            if (op == 'x' || op == 'X') {
                System.out.println("User has exited the calculator");
                break;
            }

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter the numbers to perform the operation: ");
                int a = input.nextInt();
                int b = input.nextInt();


                switch (op) {
                    case '+':
                    System.out.println("The sum is: " + (a + b));
                    break;

                    case '-':
                    System.out.println("The difference is: " + (a - b));
                    break;

                    case '*':
                    System.out.println("The product is: " + (a * b));
                    break;

                    case '/':
                    System.out.println("The division is: " + (a / b));
                    break;

                    case '%':
                    System.out.println("The remainder is: " + (a % b));
                    break;
                }
            } else {
                System.out.println("Invalid Operator");
            }
        }
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/