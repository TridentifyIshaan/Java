/*
  
  > Date Created: May 09, 2025
  > Author: Ishaan Rastogi
  > Purpose:
  Easy: https://leetcode.com/problems/peak-index-in-a-mountain-array
  Medium: https://leetcode.com/problems/find-peak-element
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working

  NOTES -

  1. A mountain array is an array whose elements increase uptil a peak and then decrease. ( Condition is arr.length >= 3 )
  2. Again, copy paste the code under function findPeak() and paste in leetcode.
  
*/

public class J18 {
    public static void main(String[] args) {
        
        // We are given a mountain array, we need to find the peak index in the mountain array.
        int[] arr = { 0, 10, 5, 2, 1, 0 };

        // The peak index is the index of the maximum element in the mountain array.
        System.out.println("The peak index is " + findPeak(arr) );

    }

    static int findPeak( int[] arr ) {
        int start = 0;
        int end = arr.length -1;

        while ( start < end ) {

            int mid = start + ( end - start ) / 2; // The trick to avoid overflow

            if ( arr[mid] > arr[mid + 1] ) { // descending part of the array
                end = mid;
            } else { // ascending part of the array
                start = mid +1;
            }
        }
        // at last, start = end and it will be the peak index because of the that whole loop

        return start; // or end, both are same
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/