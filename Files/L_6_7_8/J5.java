/*
  
  > Date Created: May 08, 2025
  > Author: Ishaan Rastogi
  > Purpose: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working

  NOTES - Again just copy the code falling under ceiling function and paste in the leetcode's main function.

  Also the question doesn't say equal to, so we will not consider the case when the target is equal to the element in the array.

  Also they say, if no ceiling is found, then return the first element of the array.
*/

import java.util.Scanner;
import java.util.Arrays;

public class J5 {
    public static void main(String[] args) {
        
        // Input the number of elements in the array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Create an array of size n
        char letters[] = new char[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array: ");
        for ( int i = 0; i < n; i++ ) {
            letters[i] = sc.next().charAt(0);
        }
        
        // Sort the array in ascending order
        Arrays.sort(letters); // We will study different sorting algorithms later.

        // Target element to be searched
        System.out.println("Enter the element to be searched: ");
        char target = sc.next().charAt(0);

        // Call the binary search function to find the element in the array
        System.out.println("The ceiling of the character is" + ceiling(letters, target));
    }

    static char ceiling( char letters[], char target ) {

        int start = 0;
        int end = letters.length -1;
        while ( start <= end ) {

            // mid = ( start + end ) / 2; can lead to overflow because ( start + end ) can exceed the range of integer in java. Hence, we use the below formula. Basically, the same formula but written in a different way.
            int mid = start + ( end - start )/2;

            if ( target < letters[mid] ) {
                end = mid - 1; // target is less than mid, so we will search in the left half of the array.
            } else {
                start = mid + 1; // target is greater than mid, so we will search in the right half of the array.
            }
        }
        return letters[ (start % letters.length) ] ; // we're using modulu operator to return the first element of the array if no ceiling is found. And when ceiling is found, it will return the ceiling element.
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/