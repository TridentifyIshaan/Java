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

/*
  If you want to change where the byte code files are getting saved then here's the following syntaxes:
  javac -d . Demo.java (It will save the byte code files in the same folder)
  javac -d .. Demo.java (It will save the byte code files in the previous folder)
  javac -d out L1/Demo.java (It will save the byte code files in the folder named out)

*/