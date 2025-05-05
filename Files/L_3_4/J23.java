/*

  > Date Created: May 5, 2025
  > Author: Ishaan Rastogi
  > Purpose: To show shadowing
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working

  NOTES-

  Shadowing in java is basically a practice of using 2 variables of the same name within the scope that overlaps where your replace the variable value.

*/

public class J23 {
    static int x = 90; // x is going to be available to everything inside the class J23
    // static is used, so that we can use it in static function
    public static void main(String[] args) {
        System.out.println(x); //90
        fun(); // 90
        int x = 40;
        System.out.println(x); // 40 -> shadowed x = 90
        int a; // Similarly, a is going to be available to everything inside the function main
    }

    static void fun() {
        System.out.println(x);
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/