/*

  > Date Created: May 5, 2025
  > Author: Ishaan Rastogi
  > Purpose: To see why the previous approach was wrong by seeing how these values are actually being passed!
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;

public class J17 {
    public static void main(String[] args) {
        String name = "Ishaan Rastogi";
        greet(name); // calling the function to greet the user
    }

    static void greet ( String name1) {
        System.out.println(name1);
        // We will still get the same output even if we change the value of name1 in this function.
        // name1 in the greet function. This is called "passing by value" as we pass the value of name to name1 into the function.
    }
}

/*

  In heap memory,
      
      Firstly, name is pointing towards Ishaan Rastogi : name -> Ishaan Rastogi
      Now, both name and name1 is pointing towards Ishaan Rastogi : name, name1 -> Ishaan Rastogi

*/


/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/