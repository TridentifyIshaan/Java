// https://leetcode.com/problems/contains-duplicate/

// Sorting Approach (Linear Searching Single Loop) - Time Complexity - O(n log n) and Space Complexity - O(1)

import java.util.Scanner;
import java.util.Arrays;

public class J2 {
    public static void main(String[] args) {
        
        // No. of input values
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Create New Array
        int[] nums = new int[n];

        // Input values in the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Calling the function and printing the result
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        java.util.Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
                }
            }
        return false;
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `

  cd "Blind 75 - Neet Code/Arrays & Hashing/217. Contains Duplicate"
  javac filename.java
  java filename
  
*/