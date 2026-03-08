// https://leetcode.com/problems/valid-anagram/

// Sorting Approach - Time Complexity - O(n log n) and Space Complexity - O(1)

import java.util.*;

public class J1 {
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

    // If we sort both the strings and they are equal, then they are anagrams
    public static boolean isAnagram( String s, String t) {

        if ( s.length() != t.length() ) {
            return false;
        }

        // Convert strings to character arrays so that we can sort them
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        // Sort the character arrays
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        // Compare the sorted arrays
        return Arrays.equals(sArr, tArr); // T/F
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `

  cd "Blind 75 - Neet Code/Arrays & Hashing/2. Valid Anagram (242)"
  javac J1.java
  java J1
  
*/