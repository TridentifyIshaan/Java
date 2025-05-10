/*
    
  > Date Created: May 10, 2025
  > Author: Ishaan Rastogi
  > Purpose: To sort an array via cycle sort
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
  NOTES - Copy paste the code below the main function and paste in leetcode.

*/

import java.util.Scanner;
import java.util.Arrays;

public class J4 {
    public static void main(String[] args) {
        
        // Input the number of elements in the array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Create an array of size n
        int nums[] = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array with range ( 1, n ): ");
        for ( int i = 0; i < n; i++ ) {
            nums[i] = sc.nextInt();
        }

        cycleSort(nums);
        System.out.println("The sorted array is " + Arrays.toString(nums));        
    }

    static void cycleSort ( int[] nums ) {

        int i = 0;
        while ( i < nums.length ) {
            int correctIndex = nums[i] - 1; // index = value -1
            if ( nums[i] != nums[correctIndex] ) {
                swap ( nums, i, correctIndex );
            } else {
                i++;
            }
        }

    }

    static void swap ( int[] nums, int a, int b ) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }    
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/