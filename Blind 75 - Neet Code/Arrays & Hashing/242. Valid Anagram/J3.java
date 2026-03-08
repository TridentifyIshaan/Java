// https://leetcode.com/problems/valid-anagram/

// Hash Table Approach Using Arrays - Time Complexity - O(n+m) and Space Complexity - O(1)

import java.util.*;

public class J3 {
    public static void main(String[] args) {
        // Input Strings
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s = sc.nextLine();
        System.out.println("Enter the second string: ");
        String t = sc.nextLine();

        // Calling the function and printing the result
        System.out.println(isAnagram(s, t));
    }

    // Hash Table Approach Using Arrays - HARD TO UNDERSTAND, I STILL HAVE NOT UNDERSTOOD IT PROPERLY.
    public static boolean isAnagram( String s, String t) {
        
        if ( s.length() != t.length() ) {
            return false;
        }

        int[] count = new int[26]; // Assuming only lowercase letters
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // Increment count for s
            count[t.charAt(i) - 'a']--; // Decrement count for t
        }

        /*
        Example: 'c' - 'a' = 2, so it maps to count[2].
        
        For each position i:

            count[...]++ adds one occurrence of the current char from s.
            count[...]-- removes one occurrence of the current char from t.
        */

        for (int i : count) {
            if (i != 0) {
                return false; // If any count is not zero, they are not anagrams
            }
        }
        return true;
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `

  cd "Blind 75 - Neet Code/Arrays & Hashing/242. Valid Anagram"
  javac J3.java
  java J3
  
*/