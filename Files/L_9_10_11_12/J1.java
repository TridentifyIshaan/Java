/*
  
  This note will be available only on first file of each folder present in folder Java .
  Documentation aka basic notes on how to run the code is already kept in each file for each programme using (/) or //.
  Wherever author needs it to be inserted, he has inserted. So that people using these files can learn easily how to code in Java Language. Author has made these programmes as a reference using courses of Kunal Kushwaha, while himself learning Java Language for the first time.
  
  > Date Created: May 10, 2025
  > Author: Ishaan Rastogi
  > Purpose: To search an element using binary search in a 1-D array
  [ Leetocode link: https://leetcode.com/problems/binary-search/ ]
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
  NOTES - Copy paste the code below the main function and paste in leetcode.

*/

import java.util.Scanner;
import java.util.Arrays;

public class J1 {
    public static void main(String[] args) {
        
        // Input the number of elements in the array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Create an array of size n
        int nums[] = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array: ");
        for ( int i = 0; i < n; i++ ) {
            nums[i] = sc.nextInt();
        }
        
        // Sort the array in ascending order
        Arrays.sort(nums); // We will study different sorting algorithms later.

        // Target element to be searched
        System.out.println("Enter the element to be searched: ");
        int target = sc.nextInt();

        // Call the binary search function to find the element in the array
        int result = binarySearch(nums, target);
        if ( result == -1 ) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    static int binarySearch( int nums[], int target ) {
        int start = 0;
        int end = nums.length -1;
        while ( start <= end ) {

            // mid = ( start + end ) / 2; can lead to overflow because ( start + end ) can exceed the range of integer in java. Hence, we use the below formula. Basically, the same formula but written in a different way.
            int mid = start + ( end - start )/2;

            if ( target < nums[mid] ) {
                end = mid - 1; // target is less than mid, so we will search in the left half of the array.
            } else if ( target > nums[mid] ) {
                start = mid + 1; // target is greater than mid, so we will search in the right half of the array.
            } else {
                return mid; // the answer is found.
            }
        }
        return -1; // if the element is not found in the array, then return -1.
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/