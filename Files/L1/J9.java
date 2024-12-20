/*
  
  > Date Created: December 20, 2024
  > Author: Ishaan Rastogi
  > Purpose: To give out bonus to employees based on their years of service
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;

public class J9 {
    public static void main(String[] args) {
        
        //Scanning the input
        Scanner input = new Scanner(System.in);
        
        //Taking the input years of service
        System.out.println("Enter the number of years of service: ");
        int years = input.nextInt();
        
        //Taking the input salary
        System.out.println("Enter the salary: ");
        int salary = input.nextInt();

        // if else conditional loop
        if (years >= 10) {
            System.out.println("You are eligible for a bonus of $5000");
            salary += 5000;
        } else {
            System.out.println("You are not eligible for a bonus");
        }
        //Printing the final salary
        System.out.println("Your current salary is $" + salary);
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename

*/