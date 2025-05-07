/*
  
  > Date Created: May 07, 2025
  > Author: Ishaan Rastogi
  > Purpose: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/ ( Do by log logic)
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
*/

import java.util.Scanner;

public class J9 {
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
        for ( int num : nums ) {
            if ( num == 0) {
                continue; // 0 has 1 digit, so skip it and we can't take log of 0
            }

            int digits = (int) Math.log10(num) +1;
            // the logic is that log10(10) = 1, log10(100) = 2, log10(1000) = 3, so on.
            // Hence, we add 1 to log10(num) to get the number of digits.

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