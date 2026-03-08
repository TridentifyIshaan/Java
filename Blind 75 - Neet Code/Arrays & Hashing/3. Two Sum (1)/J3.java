// https://leetcode.com/problems/two-sum/

// Hash Map Two Pass Approach - Time Complexity - O(n) and Space Complexity - O(n)

import java.util.*;

public class J3 {
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
        We can use a hash map to store the value and index of each element in the array. Then, we can iterate through the array and check if the complement of the current element exists in the hash map. The complement must be at a different index, because we can't use the same element twice.
    */
    static public int[] twoSum(int[] nums, int target) {
        // Create a hash map to store value and index
        Map<Integer, Integer> map = new HashMap<>();
        for ( int i = 0; i < nums.length; i++ ) {
            map.put(nums[i], i);
        }
        // Iterate through the array and check for complement
        for ( int j = 0; j < nums.length; j++ ) {
            int diff = target - nums[j]; // complement
            if ( map.containsKey(diff) && map.get(diff) != j ) {
                return new int[] { j, map.get(diff) };
            }
        }
        return null;
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `

  cd "Blind 75 - Neet Code/Arrays & Hashing/3. Two Sum (1)"
  javac J3.java
  java J3
  
*/