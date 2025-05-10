/*
  
  > Date Created: May 08, 2025
  > Author: Ishaan Rastogi
  > Purpose: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
  NOTES - Copy the searchRange and search function and paste in the leetcode's main function.

*/

import java.util.Scanner;
import java.util.Arrays;

public class J6 {
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
        
        // Sort the array in ascending order
        Arrays.sort(nums); // We will study different sorting algorithms later.

        // Target element to be searched
        System.out.println("Enter the element to be searched: ");
        int target = sc.nextInt();

        // Call the binary search function to find the element in the array
        J6 obj = new J6();
        obj.searchRange(nums, target);
    }

    public int[] searchRange( int nums[], int target ) {

        // int[] means array of integers. So, we will create an array of size 2 and return it.
        int[] ans = {-1, -1};

        // Check for the first occurrence of the target element in the array.
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    int search( int nums[], int target, boolean findStartIndex ) {
        
        int ans = -1;

        int start = 0;
        int end = nums.length -1;
        
        while ( start <= end ) {

            // mid = ( start + end ) / 2; can lead to overflow because ( start + end ) can exceed the range of integer in java. Hence, we use the below formula. Basically, the same formula but written in a different way.
            int mid = start + ( end - start )/2;

            if ( target < nums[mid] ) {
                end = mid - 1; // target is less than mid, so we will search in the left half of the array.
            } else if ( target > nums[mid] ) {
                start = mid + 1; // target is greater than mid, so we will search in the right half of the array.
            } else {
                // potential answer found
                ans = mid;
                if ( findStartIndex ) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans; // if the element is not found in the array, then return -1.
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/