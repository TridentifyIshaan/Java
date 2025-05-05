/*

  > Date Created: May 5, 2025
  > Author: Ishaan Rastogi
  > Purpose: To change value of array using a function
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Arrays;

public class J19 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        change(arr);
        System.out.println(Arrays.toString(arr)); // Converting integer array to string for better readability.
    }

    static void change ( int[] arr) {
        arr[0] = 99; // This will change the first element of the array to 99.
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/