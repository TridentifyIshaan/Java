/*
  
  > Date Created: December 16, 2024
  > Author: Ishaan Rastogi
  > Purpose: To take input & showcase package concept
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

// Just to show package concept
// package Files.L1; //package means it is inside the folder L1

import java.util.Scanner; //importing Scanner class from java.util package from which you can take input

public class J3 { // Class name should be same as the file name    
    public static void main(String[] args) { //first method / function to be called by JVM
        Scanner input = new Scanner(System.in); //creating object of Scanner class using new keyword
        System.out.println(input.nextInt()); //taking integer input from user & printing it
    }
}

/*

  NOTES-
  > Scanner: This is a class in the java.util package used for obtaining the input of primitive types like int, double, etc., and strings.
  > input: This is the name of the Scanner object being created.
  > new Scanner(System.in): This creates a new Scanner object that reads input from the standard input stream (System.in), which is typically the keyboard.

  > netInt() for integer
  > nextDouble() for double
  > next() for string
  > nextLine() for line
  > nextBoolean() for boolean
  > nextByte() for byte
  > nextFloat() for float
  > nextLong() for long
  > nextShort() for short

*/

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename

  javac -d out L1/3.java (It will save the byte code files in the folder named out)

*/
