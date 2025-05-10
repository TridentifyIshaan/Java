/*
    
  > Date Created: May 10, 2025
  > Author: Ishaan Rastogi
  > Purpose: To sort an array via selection sort
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
  NOTES - Copy paste the code below the main function and paste in leetcode.

*/

import java.util.Scanner;
import java.util.Arrays;

public class J2 {
    public static void main(String[] args) {
        
        // Input the number of elements in the array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Create an array of size n
        int nums[] = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array: ");
        for ( int i = 0; i < n; i++ ) {
            nums[i] = sc.nextInt();
        }

        selectionSort(nums);
        System.out.println("The sorted array is " + Arrays.toString(nums));        
    }

    static void selectionSort ( int[] nums ) {

        // run the loop for n-1 times
        for ( int i = 0; i < nums.length; i++ ) {
            // find the max element and put it at the end
            int last = nums.length - i - 1;
            int maxIndex = getMaxIndex(nums, 0, last);
            swap ( nums, maxIndex, last );
        }
    }

    static void swap ( int[] nums, int a, int b ) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    
    static int getMaxIndex ( int[] nums, int start, int end ) {
        int max = start;
        for ( int i = start; i <= end; i++ ) {
            if ( nums[i] > nums[max] ) {
                max = i;
            }
        }
        return max;
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/