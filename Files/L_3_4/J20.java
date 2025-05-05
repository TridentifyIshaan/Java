/*

  > Date Created: May 5, 2025
  > Author: Ishaan Rastogi
  > Purpose: To show function scope.
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working

*/

public class J20 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // ERROR - System.out.println(num); since we can only access the variable inside the method it is declared in.
        // That's why the numbers were not getting swapped because the variables' swapping operation were limited to the function.
    }
    
    static void random() {
        int num = 67;
        System.out.println(num);
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/