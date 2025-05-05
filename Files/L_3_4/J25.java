/*

  > Date Created: May 5, 2025
  > Author: Ishaan Rastogi
  > Purpose: To show method overloading
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working

  NOTES-

  Method overloading - 2 or more methods can exist with same name if the parameters are different

*/

public class J25 {
    public static void main(String[] args) {
        fun("Ishaan");
        fun(50);
    }

    static void fun(int a) {
        System.out.println("First one");
    }

    static void fun(String name) {
        System.out.println("Second one");
    }

}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/