/*

  > Date Created: May 5, 2025
  > Author: Ishaan Rastogi
  > Purpose: To return something using static function
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

public class J11 {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);   
    }

    static String greet () {
        String greeting = "How are you?";
        return greeting;
    }
}
/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/