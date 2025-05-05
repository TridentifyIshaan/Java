/*

  > Date Created: May 5, 2025
  > Author: Ishaan Rastogi
  > Purpose: To show loop scope.
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working

*/

public class J22 {
    public static void main(String[] args) {
        for ( int i = 0; i < 5; i++ ) {
            System.out.println(i);
        }
        // Error - System.out.println(i);
    }
}

// NOTE - Anything initialized inside any blocks can be initialized outside those blocks but anything initialized outside any blocks can't be initialized inside those blocks. But we can modify everything, anywhere!

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/