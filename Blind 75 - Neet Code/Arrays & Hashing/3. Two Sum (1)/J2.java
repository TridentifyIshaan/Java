// https://leetcode.com/problems/two-sum/

// Two Pointers with Sorting Approach - Time Complexity - O(n log n) and Space Complexity - O(n)

import java.util.*;

public class J2 {
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

    /*
        First we create pairs of (value, original_index), then sort by value.
        Two pointers - one pointer at the start and another at the end of the sorted pairs.
        If the sum of the two pointers is equal to the target, return the original indices.
        If the sum is less than the target, move the left pointer to the right.
        If the sum is greater than the target, move the right pointer to the left.
    */
    static public int[] twoSum(int[] nums, int target) {
        // Create array of pairs (value, original index)
        int[][] pairs = new int[nums.length][2]; // rows as much as array's length ; 2 columns: [value, original_index]
        for ( int i = 0; i < nums.length; i++ ) {
            pairs[i][0] = nums[i];  // value
            pairs[i][1] = i;         // original index
        }
        
        // Sort by value - using Comparator to sort based on the first element of the pair (the value)
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));
        // a -> a[0] is a lambda expression that takes an array 'a' and returns the first element (the value) for comparison during sorting.
        
        int left = 0;
        int right = nums.length - 1;
        while ( left < right ) {
            int sum = pairs[left][0] + pairs[right][0];
            if ( sum == target ) {
                // Return original indices
                return new int[] { pairs[left][1], pairs[right][1] };
            } else if ( sum < target ) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `

  cd "Blind 75 - Neet Code/Arrays & Hashing/3. Two Sum (1)"
  javac J2.java
  java J2
  
*/