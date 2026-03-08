// https://leetcode.com/problems/contains-duplicate/

// Brute Force Approach - Time Complexity - O(n^2) and Space Complexity - O(1)


import java.util.Scanner;

public class J1 {
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
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `

  cd "Blind 75 - Neet Code/Arrays & Hashing/1. Contains Duplicate (217)"
  javac J1.java
  java J1
  
*/