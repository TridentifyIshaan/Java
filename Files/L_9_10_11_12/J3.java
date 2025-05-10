/*
    
  > Date Created: May 10, 2025
  > Author: Ishaan Rastogi
  > Purpose: To sort an array via insertion sort
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
  NOTES - Copy paste the code below the main function and paste in leetcode.

*/

import java.util.Scanner;
import java.util.Arrays;

public class J3 {
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

        insertionSort(nums);
        System.out.println("The sorted array is " + Arrays.toString(nums));        
    }

    static void insertionSort ( int[] nums ) {

        // run the loop for n-1 times
        for ( int i = 0; i < nums.length - 1; i++ ) { // i <= n - 2
            for ( int j = i + 1; j > 0; j-- ) {
                if ( nums[j] < nums[j - 1] ) {
                    swap ( nums, j, j - 1 );
                } else {
                    break;
                }
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