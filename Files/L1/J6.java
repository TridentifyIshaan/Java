/*
  
  > Date Created: December 16, 2024
  > Author: Ishaan Rastogi
  > Purpose: To showcase typecasting and automatic type promotion in Java.
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;

// Typecasting is the process of converting one data type to another explicitly.

public class J6 {
    public static void main(String[] args) {
      int num = (int)(3.14f);
      System.out.println(num);

      // Automatic Type Promotion in Expressions
      int x = 257;
      byte y = (byte)(x);
      System.out.println(y); //1
      // Range of byte is 256 but x is 257 so it will be 257 % 256 = 1

      byte a = 40;
      byte b = 50;
      byte c = 100;
      int d = a * b / c;
      // a * b = 2000
      // 2000 / c = 20
      System.out.println(d); //20
      
      // Java is automatically promoting the byte to int as a*b exceeds the range of byte.
      // The evaluation of expression is done in int, so the final result is in int whether it exceeds the range of byte or not.

      }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename

*/
