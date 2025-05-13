/*
    
  > Date Created: May 10, 2025
  > Author: Ishaan Rastogi
  > Purpose: https://leetcode.com/problems/missing-number/ ( Amazon )
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
  NOTES - Copy paste the code below the main function and paste in leetcode.

*/

import java.util.Scanner;
import java.util.Arrays;

public class J5 {
    public static void main(String[] args) {
        
        // Input the number of elements in the array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Create an array of size n
        int nums[] = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array with range ( 0, n ): ");
        for ( int i = 0; i < n; i++ ) {
            nums[i] = sc.nextInt();
        }

        missingNumber(nums);
        System.out.println("The sorted array is " + Arrays.toString(nums));        
    }

    static int missingNumber ( int[] nums ) {

        int i = 0;
        while ( i < nums.length ) {
            if ( nums[i] < nums.length && nums[i] != nums[nums[i]] ) { // 0 <= nums[i] < n and element is not equal to its own index
                swap ( nums, i, nums[i] );
            } else {
                i++;
            }
        }

        // search for the missing number
        for ( int j = 0; j < nums.length; j++ ) {
            if ( nums[j] != j ) {
                return j;
            }
        }

        // case 2
        return nums.length;

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