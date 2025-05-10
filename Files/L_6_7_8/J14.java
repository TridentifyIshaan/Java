/*
  
  > Date Created: May 09, 2025
  > Author: Ishaan Rastogi
  > Purpose: Split Array Largest Sum
    Given an array nums which consists of non-negative integers and an integer m, you can split the array into m non-empty continuous subarrays. Write an algorithm to minimize the largest sum among these m subarrays.
    [ Leetcode link - https://leetcode.com/problems/split-array-largest-sum/ ]
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
  NOTES - Again paste the code below main function in leetcode

*/

public class J14 {
    public static void main(String[] args) {
        int[] nums = {7,2,5,8,10};
        int k = 2;        
        System.out.println("The minimum largest sum is: " + splitArray(nums, k));
    }

    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for ( int i = 0; i < nums.length; i++ ) {
            start = Math.max(start, nums[i]); // At the end of the loop start will store the maximum element in the array
            end += nums[i]; // end will store the sum of all elements in the array
        }

        // Binary search
        while ( start < end ) {

            int mid = start + ( end - start )/2;

            // calculate the number of subarrays with the maximum sum as mid
            int sum = 0;
            int subarrays = 1; // at least one subarray is there
            
            for ( int num : nums) {
                if ( sum + num > mid ) {
                    // You cannot add this element to the current subarray, so you have to create a new subarray
                    // say you add this num in new subarray, then sum = num ( Eg- Starting new array with 8, so sum = 8)
                    sum = num;
                    // one array increased
                    subarrays++;
                } else {
                    // You can add this element to the current subarray
                    sum += num; // say you add this num in current subarray, then sum = sum + num ( Eg- Adding 2 in previous array, so sum = 7 + 2 = 9)
                }
            }
            if ( subarrays > k ) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end; // start == end == mid
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/