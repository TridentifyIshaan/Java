// https://leetcode.com/problems/group-anagrams/description/

// Hash Table Approach - Time Complexity - O(m * n) and Space Complexity - O(m*n)
// NOT TURNING OUT OPTIMAL.

import java.util.*;

public class J2 {
    public static void main(String[] args) {
        System.out.println("Enter the number of strings:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        System.out.println("Enter the strings:");
        for ( int i = 0; i < strs.length; i++ ) {
            strs[i] = sc.next();
        }

        List<List<String>> result = new J2().groupAnagrams(strs);
        for ( List<String> group : result ) {
            System.out.println(group);
        }
    }

    /*
        Instead of sorting each string, we can represent every string by the frequency of its characters. Since the problem uses lowercase English letters, a fixed-size array of length 26 can capture how many times each character appears.

        Two strings are anagrams if and only if their frequency arrays are identical. By using this frequency array (converted to a tuple so it can be a dictionary key), we can group all strings that share the same character counts.
    */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> Map = new HashMap<>();
        for ( String s : strs) {
            int[] count = new int[26]; // Frequency array
            for ( char c : s.toCharArray() ) {
                count[c-'a']++; // Increment the counting index
            }
            String key = Arrays.toString(count); // Convert frequency array to string to use as a key
            Map.putIfAbsent(key, new ArrayList<>()); // If the key is not already in the map, create a new empty list for that key.
            Map.get(key).add(s); // Retrieve the list associated with the key and add the original string to it.
        }
        return new ArrayList<>(Map.values());
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `

  cd "Blind 75 - Neet Code/Arrays & Hashing/4. Group Anagrams (49)"
  javac J2.java
  java J2
  
*/