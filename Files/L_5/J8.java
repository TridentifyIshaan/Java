/*
  
  > Date Created: May 07, 2025
  > Author: Ishaan Rastogi
  > Purpose: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;

public class J8 {
    public static void main(String[] args) {            
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        
        // traversal of 1-D Array for input
        for ( int i = 0; i < n; i++ ) {
            nums[i] = sc.nextInt();
        }
        // function call to find the element in 1-D array
        System.out.println(findNumbers(nums));
    }

    static int findNumbers ( int[] nums ) {
        int count = 0;
        // for each loop
        for ( int i : nums ) {
            int digits = 0;
            int num = i; // Assign the value of i to num
            // while loop
            while ( num > 0 ) {
                digits++;
                // to remove the last digit from the number
                num /= 10;
            }

            // check if the number of digits is even or not
            if ( digits % 2 == 0 ) {
                count++;
            }
        }
        return count;
    } 
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/