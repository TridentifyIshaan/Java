// https://leetcode.com/problems/two-sum/

// Brute Force Approach - Time Complexity - O(n^2) and Space Complexity - O(1)

import java.util.*;

public class J1 {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for ( int i = 0; i < nums.length; i++ ) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target:");
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }

    static public int[] twoSum(int[] nums, int target) {
        for ( int i = 0; i < nums.length; i++ ) {
            for ( int j = i + 1; j < nums.length; j++ ) {
                if ( nums[i] + nums[j] == target ) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `

  cd "Blind 75 - Neet Code/Arrays & Hashing/3. Two Sum (1)"
  javac J1.java
  java J1
  
*/