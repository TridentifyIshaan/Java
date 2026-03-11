// https://leetcode.com/problems/product-of-array-except-self/

// Brute Force Approach - Time Complexity - O(n^2) and Space Complexity - O(1)

import java.util.*;

public class J1 {
    public static void main(String[] args) {

    }

    public int[] productExceptSelf(int[] nums) {
        vector<Integer> v = new vector<>();
        for ( int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    product *= nums[j];
                }
            }
            v.add(product);
        }
    }
}
 
/*
  
  For Terminal Code... Ctrl + Shift + `

  cd "Blind 75 - Neet Code/Arrays & Hashing/5. Product of Array Except Self (238)"
  javac J1.java
  java J1
  
*/