/*
  
  > Date Created: May 09, 2025
  > Author: Ishaan Rastogi
  > Purpose: To find the rotation count in rotated sorted array without duplicates
  [ Leetcode link - https://leetcode.com/problems/find-minimum-in-rotated-sorted-array ]
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working

  NOTES - Rotation count = (pivot + 1) times = index of minimum element
  
*/

public class J12 {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(countRotations(arr)); 
    }

    static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    // Function to count the number of rotations in a rotated sorted array without duplicates
    static int findPivot ( int[] arr ) {
        int start = 0;
        int end = arr.length -1;
        while ( start <= end ) {
            int mid = start + ( end - start ) / 2;
            
            // CASE 1
            if ( mid < end && arr[mid] > arr[mid+1] ) { // mid < end because at end, mid+1 will be out of bound | && is logical operator for AND gate
                return mid;
            }

            // CASE 2
            if ( mid > start && arr[mid] < arr[mid-1] ) {
                return mid -1;
            }
            
            // CASE 3 & 4
            if ( arr[start] >= arr[mid] ) {
                end = mid -1;
            } else {
                start = mid +1;
            }
        }
        return -1; // no pivot found
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/