// https://leetcode.com/problems/group-anagrams/description/

// Hash Map with Sorting Approach - Time Complexity - O(m * n log n) and Space Complexity - O(m*n)

import java.util.*;

public class J1 {
    public static void main(String[] args) {
        System.out.println("Enter the number of strings:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        System.out.println("Enter the strings:");
        for ( int i = 0; i < strs.length; i++ ) {
            strs[i] = sc.next();
        }

        List<List<String>> result = new J1().groupAnagrams(strs);
        for ( List<String> group : result ) {
            System.out.println(group);
        }
    }

    /*
        1. Create a hash map where each key is the sorted version of a string, and the value is a list of strings belonging to that anagram group.
        
        2. Iterate through each string in the input list:
            - Sort the characters of the string to form a key.
            - Append the original string to the list corresponding to this key.
            
        3. After processing all strings, return all values from the hash map, which represent the grouped anagrams.
    
        For example, "eat", "tea", and "ate" all become "aet" after sorting.
    
    */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> Map = new HashMap<>();
        for ( String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            Map.putIfAbsent(key, new ArrayList<>()); // If the key is not already in the map, create a new empty list for that key.
            Map.get(key).add(s); // Retrieve the list associated with the key and add the original string to it.
        }
        return new ArrayList<>(Map.values());
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `

  cd "Blind 75 - Neet Code/Arrays & Hashing/3. Two Sum (1)"
  javac J1.java
  java J1
  
*/