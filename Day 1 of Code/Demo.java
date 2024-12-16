/*
  
  > Date Created: December 16, 2024
  > Author: Ishaan Rastogi
  > Purpose: To test out CLA in Java and print out index of arrays
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

public class Demo { // Class name should be same as the file name    
    public static void main(String[] args) { //first method / function to be called by JVM
        System.out.println(args[1]); // It will print the second argument passed in the command line
    }
}

// String[] args- It is used to store command line arguments. We will learn about it later in the course. It's an array of type String.

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac Demo.java
  java Demo 30 Ishaan
*/