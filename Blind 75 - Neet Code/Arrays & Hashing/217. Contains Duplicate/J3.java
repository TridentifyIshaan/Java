// https://leetcode.com/problems/contains-duplicate/

// Hash Set Length - Time Complexity - O(n) and Space Complexity - O(n)

import java.util.*;

public class J3 {
    public static void main(String[] args) {
        
        // No. of input values
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the hash set: ");
        int n = sc.nextInt();

        // Create New Hash Set

        Set<Integer> nums = new HashSet<>();

        // Input values in the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        // Calling the function and printing the result
        System.out.println(containsDuplicate(nums, n));
    }

    /*
        CONCEPT OF HASH SET-

        ANY SET CAN'T CONTAIN DUPLICATE VALUES, IF WE TRY TO ADD DUPLICATE VALUES IN THE SET, IT WILL IGNORE THE DUPLICATE VALUES AND ONLY ADD THE UNIQUE VALUES IN THE SET.

        HASH SET IS A DATA STRUCTURE THAT IMPLEMENTS THE SET INTERFACE AND USES A HASH TABLE FOR STORAGE, SO WE NEED NOT CHECK OTHER NUMBERS FOR DUPLICATE. HENCE, IT PROVIDES US TIME COMPLEXITY OF O(n) FOR ADDING n ELEMENTS.

    */

    public static boolean containsDuplicate(Set<Integer> nums, int n) {
        return nums.size() < n; // If size is less than n, there are duplicates
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `

  cd "Blind 75 - Neet Code/Arrays & Hashing/217. Contains Duplicate"
  javac filename.java
  java filename
  
*/