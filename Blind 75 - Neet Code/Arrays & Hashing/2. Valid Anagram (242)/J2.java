// https://leetcode.com/problems/valid-anagram/

// Hash Map Approach - Time Complexity - O(n+m) and Space Complexity - O(1)

import java.util.*;

public class J2 {
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

    // We can use a hash map to count the frequency of each character in the first string and then decrement the count for each character in the second string. If all counts are zero, then they are anagrams.
    // Hash map contains Key-Value pairs like in dictionary.
    public static boolean isAnagram( String s, String t) {
        
        if ( s.length() != t.length() ) {
            return false;
        }

        // Create New Hash Map
        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        // Count the frequency of each character in the first string by first converting the string to a character array and then iterating through it

        for ( char c : s.toCharArray() ) {
            countS.put(c, countS.getOrDefault(c, 0) + 1); // If the character is not present in the hash map, it will return 0 and then we add 1 to it. If it is present, it will return the current count and then we add 1 to it.
        }
        for ( char c : t.toCharArray() ) {
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }
        return countS.equals(countT); // T/F
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `

  cd "Blind 75 - Neet Code/Arrays & Hashing/2. Valid Anagram (242)"
  javac J2.java
  java J2
  
*/