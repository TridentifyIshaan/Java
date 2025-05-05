/*

  > Date Created: May 5, 2025
  > Author: Ishaan Rastogi
  > Purpose: To show block scope.
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working

*/

public class J21 {
    public static void main(String[] args) {
        int a = 10;
        /*
          Error - variable can't be initialized again, even if in separate block.
            {
                int a = 78;
                int c = 90;
            }
            System.out.println(c); // This will give an error because the variable 'c' is declared in a different block and is not accessible here.
        */

        // NOTE - But the values can be modified in other blocks or same block.
        {
            a = 100;
            System.out.println(a); // This will print 100, because the value of 'a' is modified in this block.
        }
        System.out.println(a); // 100
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/