/*
  
  > Date Created: May 09, 2025
  > Author: Ishaan Rastogi
  > Purpose: To find the rotation count in rotated sorted array with duplicates
    [ Leetcode link - https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii ]
  > Operating System: This is only for Windows OS, it may or may not work on other OS
  > Program Status: 100% Working
  
  NOTES - Rotation count = (pivot + 1) times = index of minimum element

*/

public class J13 {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(countRotations(arr)); 
    }

    static int countRotations(int[] arr) {
        int pivot = findPivotWithDuplicates(arr);
        return pivot + 1;
    }

    // Function to find the pivot in a rotated sorted array with duplicates
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // CASE 1: Check if mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // CASE 2: Check if mid-1 is the pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // CASE 3: Handle duplicates (skip duplicates)
            if (arr[start] == arr[mid] && arr[end] == arr[mid]) {
                // Check if start is the pivot
                if (start < end && start + 1 < arr.length && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // Check if end is the pivot
                if (end > start && end - 1 >= 0 && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // CASE 4: Left side is sorted, pivot must be in the right side
            else if (arr[start] <= arr[mid]) {
                start = mid + 1;
            }
            // CASE 5: Right side is sorted, pivot must be in the left side
            else {
                end = mid - 1;
            }
        }
        return -1; // No pivot found
    }
}

/*
  
  For Terminal Code... Ctrl + Shift + `
  javac filename.java
  java filename
  
*/