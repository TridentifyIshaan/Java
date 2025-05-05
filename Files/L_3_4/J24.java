/*

  > Date Created: May 5, 2025
  > Author: Ishaan Rastogi
  > Purpose: To show variable arguements
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working

*/

import java.util.Arrays;

public class J24 {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 56, 87, 23, 45, 65)
        // Arrays with variable length or variables with variable quantity
        fun(); // empty array

        multiple(2, 3, "Ishaan", "Rastogi");
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    
    // This is allowed
    static void multiple( int a, int b, String ...v) {
        // But (int a, String ...v, int b) is not allowed because we won't know when will v end and when will b start
    }

}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/