/*

  > Date Created: May 5, 2025
  > Author: Ishaan Rastogi
  > Purpose: To pass string values using functions
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

public class J13 {
    public static void main(String[] args) {
        String message = greet("Ishaan Rastogi");
        System.out.println(message);
    }

    static String greet (String name) {
        String message = "Hello " + name;
        return message;
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/